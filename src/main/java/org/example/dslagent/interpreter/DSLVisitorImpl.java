package org.example.dslagent.interpreter;

import org.example.dslagent.parser.TaobaoDSLBaseVisitor;
import org.example.dslagent.parser.TaobaoDSLParser;

import java.util.*;

public class DSLVisitorImpl extends TaobaoDSLBaseVisitor<Object> {

    private final Map<String, Object> variables = new HashMap<>();
    private final Map<String, Map<String, Object>> products = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);
    private String currentCatalog = "";
    private String lastUserInput = "";

    // ========== 程序入口 ==========
    @Override
    public Object visitProgram(TaobaoDSLParser.ProgramContext ctx) {
        System.out.println("🛍️ 淘宝购物DSL解释器启动");
        System.out.println("==============================");

        // 先处理所有商品目录
        for (var catalog : ctx.productCatalog()) {
            visitProductCatalog(catalog);
        }

        // 再处理所有场景
        for (var scenario : ctx.dialogueScenario()) {
            visitDialogueScenario(scenario);
        }

        return null;
    }

    // ========== 商品目录处理 ==========
    @Override
    public Object visitProductCatalog(TaobaoDSLParser.ProductCatalogContext ctx) {
        String catalogName = ctx.ID().getText();
        currentCatalog = catalogName;
        products.put(catalogName, new HashMap<>());

        System.out.println("📁 加载商品目录: " + catalogName);

        for (var productDef : ctx.productDefinition()) {
            visitProductDefinition(productDef);
        }

        currentCatalog = "";
        return null;
    }

    @Override
    public Object visitProductDefinition(TaobaoDSLParser.ProductDefinitionContext ctx) {
        String productId = ctx.ID().getText();
        Map<String, Object> product = new HashMap<>();

        // 默认值
        product.put("type", "UNISEX");
        product.put("season", "ALL_SEASON");
        product.put("price", 0);
        product.put("stock", 0);
        product.put("description", "");
        product.put("catalog", currentCatalog);

        // 处理属性
        for (var attr : ctx.attribute()) {
            if (attr.productType() != null) {
                product.put("type", attr.productType().getText());
            } else if (attr.seasonType() != null) {
                product.put("season", attr.seasonType().getText());
            } else if (attr.INT() != null) {
                String attrText = attr.getText();
                if (attrText.contains("price")) {
                    product.put("price", Integer.parseInt(attr.INT().getText()));
                } else if (attrText.contains("stock")) {
                    product.put("stock", Integer.parseInt(attr.INT().getText()));
                }
            } else if (attr.STRING() != null) {
                String desc = attr.STRING().getText();
                product.put("description", desc.substring(1, desc.length() - 1));
            }
        }

        products.get(currentCatalog).put(productId, product);
        System.out.println("  ✅ " + productId + " [" + product.get("type") + "/" + product.get("season") + "]");

        return null;
    }

    // ========== 对话场景处理 ==========
    @Override
    public Object visitDialogueScenario(TaobaoDSLParser.DialogueScenarioContext ctx) {
        String scenarioName = ctx.ID().getText();
        System.out.println("\n📋 执行场景: " + scenarioName);
        System.out.println("--------------------------------");

        // 执行所有语句
        for (var stmt : ctx.statement()) {
            visitStatement(stmt);
        }

        // 执行所有意图规则
        for (var rule : ctx.intentRule()) {
            visitIntentRule(rule);
        }

        return null;
    }

    @Override
    public Object visitStatement(TaobaoDSLParser.StatementContext ctx) {
        if (ctx.varDeclaration() != null) {
            return visitVarDeclaration(ctx.varDeclaration());
        } else if (ctx.assignment() != null) {
            return visitAssignment(ctx.assignment());
        } else if (ctx.printStatement() != null) {
            return visitPrintStatement(ctx.printStatement());
        } else if (ctx.waitStatement() != null) {
            return visitWaitStatement(ctx.waitStatement());
        } else if (ctx.recommendStatement() != null) {
            return visitRecommendStatement(ctx.recommendStatement());
        } else if (ctx.checkStockStatement() != null) {
            return visitCheckStockStatement(ctx.checkStockStatement());
        } else if (ctx.showCatalogStatement() != null) {
            return visitShowCatalogStatement(ctx.showCatalogStatement());
        }
        return null;
    }

    // ========== 基本语句实现 ==========
    @Override
    public Object visitVarDeclaration(TaobaoDSLParser.VarDeclarationContext ctx) {
        String type = ctx.type().getText();
        String varName = ctx.ID().getText();

        if (ctx.expression() != null) {
            Object value = visit(ctx.expression());
            variables.put(varName, value);
            System.out.println("📝 声明变量: " + varName + " = " + value);
        } else {
            // 设置默认值
            switch (type) {
                case "string": variables.put(varName, ""); break;
                case "int": variables.put(varName, 0); break;
                case "bool": variables.put(varName, false); break;
            }
            System.out.println("📝 声明变量: " + varName + " (" + type + ")");
        }

        return null;
    }

    @Override
    public Object visitAssignment(TaobaoDSLParser.AssignmentContext ctx) {
        String varName = ctx.ID().getText();
        Object value = visit(ctx.expression());
        variables.put(varName, value);
        System.out.println("💾 赋值: " + varName + " = " + value);
        return value;
    }

    @Override
    public Object visitPrintStatement(TaobaoDSLParser.PrintStatementContext ctx) {
        Object value = visit(ctx.expression());
        System.out.println("🤖 客服: " + value);
        return null;
    }

    @Override
    public Object visitWaitStatement(TaobaoDSLParser.WaitStatementContext ctx) {
        String prompt = ctx.STRING().getText();
        prompt = prompt.substring(1, prompt.length() - 1);
        System.out.print("👤 " + prompt + ": ");
        lastUserInput = scanner.nextLine();
        variables.put("last_input", lastUserInput);
        return lastUserInput;
    }

    // ========== 商品相关语句实现 ==========
    @Override
    public Object visitRecommendStatement(TaobaoDSLParser.RecommendStatementContext ctx) {
        String forType = null;
        String season = null;
        Integer maxPrice = null;

        if (ctx.STRING() != null) {
            forType = ctx.STRING().getText();
            forType = forType.substring(1, forType.length() - 1);
        }
        if (ctx.seasonType() != null) {
            season = ctx.seasonType().getText();
        }
        if (ctx.INT() != null) {
            maxPrice = Integer.parseInt(ctx.INT().getText());
        }

        System.out.println("✨ 为您推荐商品：");
        System.out.println("  类型: " + (forType != null ? forType : "不限"));
        System.out.println("  季节: " + (season != null ? season : "所有季节"));
        System.out.println("  最高价: " + (maxPrice != null ? maxPrice + "元" : "不限"));

        List<String> recommendations = filterProducts(forType, season, maxPrice);
        for (String rec : recommendations) {
            System.out.println("   - " + rec);
        }

        return null;
    }

    @Override
    public Object visitCheckStockStatement(TaobaoDSLParser.CheckStockStatementContext ctx) {
        String productId = ctx.ID().getText();
        int required = ctx.INT() != null ? Integer.parseInt(ctx.INT().getText()) : 1;

        int stock = getProductStock(productId);

        if (stock >= required) {
            System.out.println("✅ 商品 " + productId + " 库存充足 (" + stock + "件)");
            return true;
        } else {
            System.out.println("❌ 商品 " + productId + " 库存不足，仅剩 " + stock + " 件");
            return false;
        }
    }

    @Override
    public Object visitShowCatalogStatement(TaobaoDSLParser.ShowCatalogStatementContext ctx) {
        String filter = null;
        if (ctx.productType() != null) {
            filter = ctx.productType().getText();
        } else if (ctx.seasonType() != null) {
            filter = ctx.seasonType().getText();
        }

        System.out.println("📋 精品衣物店铺商品目录" + (filter != null ? " (筛选: " + filter + ")" : ""));
        displayProducts(filter);
        return null;
    }

    // ========== 意图规则实现 ==========
    @Override
    public Object visitIntentRule(TaobaoDSLParser.IntentRuleContext ctx) {
        String intent = ctx.STRING().getText();
        intent = intent.substring(1, intent.length() - 1);

        // 检查意图是否匹配用户输入
        if (lastUserInput.contains(intent)) {
            System.out.println("⚡ 匹配意图: " + intent);
            for (var stmt : ctx.statement()) {
                visitStatement(stmt);
            }
        }

        return null;
    }

    // ========== 表达式实现 ==========
    @Override
    public Object visitIdExpr(TaobaoDSLParser.IdExprContext ctx) {
        String varName = ctx.ID().getText();
        Object value = variables.get(varName);
        return value != null ? value : "变量未定义: " + varName;
    }

    @Override
    public Object visitStringLiteral(TaobaoDSLParser.StringLiteralContext ctx) {
        String text = ctx.STRING().getText();
        return text.substring(1, text.length() - 1);
    }

    @Override
    public Object visitIntLiteral(TaobaoDSLParser.IntLiteralContext ctx) {
        return Integer.parseInt(ctx.INT().getText());
    }

    @Override
    public Object visitBoolLiteral(TaobaoDSLParser.BoolLiteralContext ctx) {
        return Boolean.parseBoolean(ctx.BOOL().getText());
    }

    @Override
    public Object visitAddSubExpr(TaobaoDSLParser.AddSubExprContext ctx) {
        Object left = visit(ctx.expression(0));
        Object right = visit(ctx.expression(1));
        String op = ctx.op.getText();

        if (left instanceof Integer && right instanceof Integer) {
            return op.equals("+") ? (Integer)left + (Integer)right : (Integer)left - (Integer)right;
        } else {
            return left.toString() + right.toString();
        }
    }

    @Override
    public Object visitMulDivExpr(TaobaoDSLParser.MulDivExprContext ctx) {
        Object left = visit(ctx.expression(0));
        Object right = visit(ctx.expression(1));
        String op = ctx.op.getText();

        if (left instanceof Integer && right instanceof Integer) {
            return op.equals("*") ? (Integer)left * (Integer)right : (Integer)left / (Integer)right;
        }
        return 0;
    }

    @Override
    public Object visitGetPriceExpr(TaobaoDSLParser.GetPriceExprContext ctx) {
        String productId = ctx.ID().getText();
        int price = getProductPrice(productId);
        System.out.println("💰 商品 " + productId + " 价格: " + price + "元");
        return price;
    }

    @Override
    public Object visitGetStockExpr(TaobaoDSLParser.GetStockExprContext ctx) {
        String productId = ctx.ID().getText();
        int stock = getProductStock(productId);
        System.out.println("📦 商品 " + productId + " 库存: " + stock + "件");
        return stock;
    }

    // ========== 辅助方法 ==========
    private List<String> filterProducts(String type, String season, Integer maxPrice) {
        List<String> results = new ArrayList<>();

        for (var catalogEntry : products.entrySet()) {
            for (var productEntry : catalogEntry.getValue().entrySet()) {
                String productId = productEntry.getKey();
                Map<String, Object> product = (Map<String, Object>) productEntry.getValue();

                boolean match = true;

                if (type != null && !product.get("type").equals(type)) {
                    match = false;
                }
                if (season != null && !product.get("season").equals(season)) {
                    match = false;
                }
                if (maxPrice != null && (Integer)product.get("price") > maxPrice) {
                    match = false;
                }

                if (match) {
                    results.add(productId + " - " + product.get("description") +
                            " (" + product.get("price") + "元, 库存: " + product.get("stock") + ")");
                }
            }
        }

        if (results.isEmpty()) {
            results.add("暂无符合条件的商品");
        }

        return results;
    }

    private void displayProducts(String filter) {
        for (var catalogEntry : products.entrySet()) {
            System.out.println("  目录: " + catalogEntry.getKey());

            for (var productEntry : catalogEntry.getValue().entrySet()) {
                String productId = productEntry.getKey();
                Map<String, Object> product = (Map<String, Object>) productEntry.getValue();

                if (filter == null ||
                        product.get("type").equals(filter) ||
                        product.get("season").equals(filter)) {

                    System.out.println("    • " + productId +
                            " [" + product.get("type") + "/" + product.get("season") + "]" +
                            " - " + product.get("description") +
                            " - " + product.get("price") + "元" +
                            " (库存: " + product.get("stock") + ")");
                }
            }
        }
    }

    private int getProductPrice(String productId) {
        for (var catalog : products.values()) {
            if (catalog.containsKey(productId)) {
                return (Integer) ((Map<String, Object>)catalog.get(productId)).get("price");
            }
        }
        return 0;
    }

    private int getProductStock(String productId) {
        for (var catalog : products.values()) {
            if (catalog.containsKey(productId)) {
                return (Integer) ((Map<String, Object>)catalog.get(productId)).get("stock");
            }
        }
        return 0;
    }

    public void setUserInput(String input) {
        this.lastUserInput = input;
    }
}