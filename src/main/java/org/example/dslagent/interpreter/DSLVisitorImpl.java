package org.example.dslagent.interpreter;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.example.dslagent.parser.TaobaoDSLParser;
import org.example.dslagent.parser.TaobaoDSLBaseVisitor;
import java.util.*;

public class DSLVisitorImpl extends TaobaoDSLBaseVisitor<Object> {

    private final Map<String, Object> variables = new HashMap<>();
    private final Map<String, Map<String, Object>> products = new HashMap<>();
    private final DeepSeekClient deepSeekClient;
    private final Scanner scanner;

    private String currentCatalog = "";
    private String lastUserInput = "";
    private String currentScenario = "";
    private Map<String, Integer> scenarioUsage = new HashMap<>();
    private boolean useAI = false;

    // 场景描述映射
    private final Map<String, String> scenarioDescriptions = new HashMap<>();
    // 场景意图关键词
    private final Map<String, List<String>> scenarioKeywords = new HashMap<>();

    public DSLVisitorImpl() {
        this.deepSeekClient = new DeepSeekClient();
        this.scanner = new Scanner(System.in);
        initializeScenarios();
    }

    private void initializeScenarios() {
        // 初始化场景描述和关键词
        scenarioDescriptions.put("ClothingShopping", "用户想要购买服装类商品");
        scenarioKeywords.put("ClothingShopping", Arrays.asList("买衣服", "外套", "衬衫", "裤子", "裙子", "服装"));

        scenarioDescriptions.put("ElectronicsShopping", "用户想要购买电子产品");
        scenarioKeywords.put("ElectronicsShopping", Arrays.asList("手机", "电脑", "耳机", "电子产品", "数码"));

        scenarioDescriptions.put("AfterSales", "用户需要售后服务");
        scenarioKeywords.put("AfterSales", Arrays.asList("退货", "退款", "换货", "售后", "维修", "投诉"));

        scenarioDescriptions.put("Logistics", "用户查询物流信息");
        scenarioKeywords.put("Logistics", Arrays.asList("物流", "快递", "发货", "配送", "运输"));

        scenarioDescriptions.put("PriceNegotiation", "用户想要讨价还价");
        scenarioKeywords.put("PriceNegotiation", Arrays.asList("便宜", "优惠", "打折", "降价", "价格"));

        scenarioDescriptions.put("default", "通用对话场景");
        scenarioKeywords.put("default", Arrays.asList("你好", "谢谢", "再见", "帮助"));
    }

    // ========== 程序入口 ==========
    @Override
    public Object visitProgram(TaobaoDSLParser.ProgramContext ctx) {
        System.out.println("🤖 增强版淘宝购物助手启动");
        System.out.println("==============================");
        System.out.println("模式选择：");
        System.out.println("1. 传统关键词匹配");
        System.out.println("2. AI智能意图识别");
        System.out.print("请选择模式 (1/2): ");

        String mode = scanner.nextLine();
        useAI = "2".equals(mode.trim());

        if (useAI) {
            System.out.println("✅ 已启用AI智能意图识别");
        } else {
            System.out.println("✅ 已启用传统关键词匹配");
        }

        System.out.println("\n📂 加载商品目录...");

        // 先处理所有商品目录
        for (var catalog : ctx.productCatalog()) {
            visitProductCatalog(catalog);
        }

        System.out.println("\n🎭 可用的对话场景：");
        // 收集所有场景名称
        List<String> scenarioNames = new ArrayList<>();
        for (var scenario : ctx.dialogueScenario()) {
            String name = scenario.ID().getText();
            scenarioNames.add(name);
            System.out.println("  - " + name);
        }

        // 进入主对话循环
        runConversationLoop(scenarioNames, ctx);

        return null;
    }

    private void runConversationLoop(List<String> scenarioNames, TaobaoDSLParser.ProgramContext ctx) {
        System.out.println("\n💬 对话开始 (输入'退出'结束对话)");

        while (true) {
            // 获取用户输入
            String userInput = deepSeekClient.getUserInput(scanner);

            if ("退出".equalsIgnoreCase(userInput) || "exit".equalsIgnoreCase(userInput)) {
                System.out.println("\n👋 感谢使用，再见！");
                break;
            }

            lastUserInput = userInput;
            variables.put("last_input", userInput);

            // 识别意图并匹配场景
            String matchedScenario = recognizeAndMatchScenario(userInput, scenarioNames, ctx);

            if (matchedScenario != null) {
                System.out.println("\n🤖 识别到场景: " + matchedScenario);
                executeScenario(matchedScenario, ctx);
            } else {
                // 使用AI进行通用回复
                System.out.println("\n🤖 AI助手: " +
                        deepSeekClient.getChatResponse(userInput, "当前在淘宝购物场景"));
            }

            // 显示场景使用统计
            displayUsageStatistics();
        }
    }

    private String recognizeAndMatchScenario(String userInput, List<String> scenarioNames,
                                             TaobaoDSLParser.ProgramContext ctx) {
        String matchedScenario = null;

        if (useAI) {
            // 使用DeepSeek AI识别意图
            System.out.println("🔍 AI正在识别意图...");
            matchedScenario = deepSeekClient.recognizeIntent(
                    userInput,
                    scenarioNames.toArray(new String[0])
            );
        } else {
            // 使用传统关键词匹配
            matchedScenario = matchByKeywords(userInput, scenarioNames);
        }

        // 记录场景使用
        if (matchedScenario != null && !"default".equals(matchedScenario)) {
            scenarioUsage.put(matchedScenario, scenarioUsage.getOrDefault(matchedScenario, 0) + 1);
            currentScenario = matchedScenario;
            return matchedScenario;
        }

        return null;
    }

    private String matchByKeywords(String userInput, List<String> scenarioNames) {
        for (String scenario : scenarioNames) {
            List<String> keywords = scenarioKeywords.get(scenario);
            if (keywords != null) {
                for (String keyword : keywords) {
                    if (userInput.contains(keyword)) {
                        return scenario;
                    }
                }
            }
        }
        return null;
    }

    private void executeScenario(String scenarioName, TaobaoDSLParser.ProgramContext ctx) {
        // 在语法树中找到对应的场景并执行
        for (var scenario : ctx.dialogueScenario()) {
            if (scenarioName.equals(scenario.ID().getText())) {
                System.out.println("🚀 执行场景: " + scenarioName);
                System.out.println("--------------------------------");
                visitDialogueScenario(scenario);
                return;
            }
        }
        System.out.println("⚠️ 未找到场景: " + scenarioName);
    }

    private void displayUsageStatistics() {
        if (!scenarioUsage.isEmpty()) {
            System.out.println("\n📊 场景使用统计:");
            for (Map.Entry<String, Integer> entry : scenarioUsage.entrySet()) {
                System.out.println("  " + entry.getKey() + ": " + entry.getValue() + " 次");
            }
        }
    }

    // ========== 商品目录处理 ==========
    @Override
    public Object visitProductCatalog(TaobaoDSLParser.ProductCatalogContext ctx) {
        String catalogName = ctx.ID().getText();
        currentCatalog = catalogName;
        products.put(catalogName, new HashMap<>());

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

        product.put("type", "UNISEX");
        product.put("season", "ALL_SEASON");
        product.put("price", 0);
        product.put("stock", 0);
        product.put("description", "");
        product.put("catalog", currentCatalog);

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
        return null;
    }

    // ========== 对话场景处理 ==========
    @Override
    public Object visitDialogueScenario(TaobaoDSLParser.DialogueScenarioContext ctx) {
        currentScenario = ctx.ID().getText();

        // 执行所有语句
        for (var stmt : ctx.statement()) {
            visitStatement(stmt);
        }

        // 执行所有意图规则（传统方式）
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
        } else {
            switch (type) {
                case "string": variables.put(varName, ""); break;
                case "int": variables.put(varName, 0); break;
                case "bool": variables.put(varName, false); break;
            }
        }

        return null;
    }

    @Override
    public Object visitAssignment(TaobaoDSLParser.AssignmentContext ctx) {
        String varName = ctx.ID().getText();
        Object value = visit(ctx.expression());
        variables.put(varName, value);
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
        // 在增强版中，wait语句不阻塞，使用已获取的用户输入
        String prompt = ctx.STRING().getText();
        prompt = prompt.substring(1, prompt.length() - 1);

        if (lastUserInput.isEmpty()) {
            // 如果是首次，获取用户输入
            System.out.print("🤖 " + prompt + ": ");
            lastUserInput = scanner.nextLine();
            variables.put("last_input", lastUserInput);
        }

        return lastUserInput;
    }

    // ========== 商品相关语句实现 ==========
    @Override
    public Object visitRecommendStatement(TaobaoDSLParser.RecommendStatementContext ctx) {
        String forType = null;
        String season = null;
        Integer maxPrice = null;

        // 访问所有选项
        if (ctx.recommendOption() != null) {
            for (var option : ctx.recommendOption()) {
                if (option instanceof TaobaoDSLParser.RecommendForContext) {
                    TaobaoDSLParser.RecommendForContext forCtx =
                            (TaobaoDSLParser.RecommendForContext) option;
                    forType = forCtx.STRING().getText();
                    forType = forType.substring(1, forType.length() - 1);
                }
                else if (option instanceof TaobaoDSLParser.RecommendSeasonContext) {
                    TaobaoDSLParser.RecommendSeasonContext seasonCtx =
                            (TaobaoDSLParser.RecommendSeasonContext) option;
                    season = seasonCtx.seasonType().getText();
                }
                else if (option instanceof TaobaoDSLParser.RecommendMaxPriceContext) {
                    TaobaoDSLParser.RecommendMaxPriceContext priceCtx =
                            (TaobaoDSLParser.RecommendMaxPriceContext) option;
                    maxPrice = Integer.parseInt(priceCtx.INT().getText());
                }
            }
        }

        System.out.println("✨ 为您推荐商品：");
        if (forType != null) System.out.println("  类型: " + forType);
        if (season != null) System.out.println("  季节: " + season);
        if (maxPrice != null) System.out.println("  最高价: " + maxPrice + "元");

        List<String> recommendations = filterProducts(forType, season, maxPrice);
        if (recommendations.isEmpty()) {
            System.out.println("  暂时没有符合条件的商品");
        } else {
            for (String rec : recommendations) {
                System.out.println("   ✅ " + rec);
            }
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

        System.out.println("📋 商品目录" + (filter != null ? " (筛选: " + filter + ")" : ""));
        displayProducts(filter);
        return null;
    }

    // ========== 意图规则实现 ==========
    @Override
    public Object visitIntentRule(TaobaoDSLParser.IntentRuleContext ctx) {
        String intent = ctx.STRING().getText();
        intent = intent.substring(1, intent.length() - 1);

        // 传统关键词匹配
        if (lastUserInput.contains(intent)) {
            System.out.println("🎯 匹配到意图关键词: " + intent);
            for (var stmt : ctx.statement()) {
                visitStatement(stmt);
            }
        }

        return null;
    }

    // ========== 表达式实现 ==========
    @Override
    public Object visitExpression(TaobaoDSLParser.ExpressionContext ctx) {
        return visit(ctx.additiveExpression());
    }

    @Override
    public Object visitAdditiveExpression(TaobaoDSLParser.AdditiveExpressionContext ctx) {
        Object result = visit(ctx.multiplicativeExpression(0));

        // 处理加减运算
        for (int i = 1; i < ctx.multiplicativeExpression().size(); i++) {
            Object right = visit(ctx.multiplicativeExpression(i));
            String op = ctx.getChild(i * 2 - 1).getText(); // 获取操作符

            if (op.equals("+")) {
                if (result instanceof Integer && right instanceof Integer) {
                    result = (Integer)result + (Integer)right;
                } else {
                    result = result.toString() + right.toString();
                }
            } else if (op.equals("-")) {
                if (result instanceof Integer && right instanceof Integer) {
                    result = (Integer)result - (Integer)right;
                }
            }
        }

        return result;
    }

    @Override
    public Object visitMultiplicativeExpression(TaobaoDSLParser.MultiplicativeExpressionContext ctx) {
        Object result = visit(ctx.primaryExpression(0));

        // 处理乘除运算
        for (int i = 1; i < ctx.primaryExpression().size(); i++) {
            Object right = visit(ctx.primaryExpression(i));
            String op = ctx.getChild(i * 2 - 1).getText();

            if (result instanceof Integer && right instanceof Integer) {
                if (op.equals("*")) {
                    result = (Integer)result * (Integer)right;
                } else if (op.equals("/")) {
                    result = (Integer)result / (Integer)right;
                }
            }
        }

        return result;
    }

    @Override
    public Object visitParenExpr(TaobaoDSLParser.ParenExprContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Object visitIdExpr(TaobaoDSLParser.IdExprContext ctx) {
        String varName = ctx.ID().getText();
        return variables.getOrDefault(varName, "变量未定义: " + varName);
    }

    @Override
    public Object visitIntLiteral(TaobaoDSLParser.IntLiteralContext ctx) {
        return Integer.parseInt(ctx.INT().getText());
    }

    @Override
    public Object visitStringLiteral(TaobaoDSLParser.StringLiteralContext ctx) {
        String text = ctx.STRING().getText();
        return text.substring(1, text.length() - 1);
    }

    @Override
    public Object visitBoolLiteral(TaobaoDSLParser.BoolLiteralContext ctx) {
        return Boolean.parseBoolean(ctx.BOOL().getText());
    }

    @Override
    public Object visitGetPriceExpr(TaobaoDSLParser.GetPriceExprContext ctx) {
        String productId = ctx.ID().getText();
        int price = getProductPrice(productId);
        return price;
    }

    @Override
    public Object visitGetStockExpr(TaobaoDSLParser.GetStockExprContext ctx) {
        String productId = ctx.ID().getText();
        int stock = getProductStock(productId);
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
}