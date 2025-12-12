package org.example.dslagent;

import org.antlr.v4.runtime.*;
import org.example.dslagent.interpreter.DSLVisitorImpl;
import org.example.dslagent.parser.TaobaoDSLLexer;
import org.example.dslagent.parser.TaobaoDSLParser;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {
            // 1. 读取DSL脚本
            String scriptPath = args.length > 0 ? args[0] : "scripts/taobao_shopping.dsl";
            String scriptContent = readScriptFile(scriptPath);

            System.out.println("📖 正在解析脚本: " + scriptPath);
            System.out.println("=".repeat(50));

            // 2. 词法分析
            TaobaoDSLLexer lexer = new TaobaoDSLLexer(CharStreams.fromString(scriptContent));

            // 3. 语法分析
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TaobaoDSLParser parser = new TaobaoDSLParser(tokens);

            // 4. 设置错误监听器
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer,
                                        Object offendingSymbol,
                                        int line, int charPositionInLine,
                                        String msg, RecognitionException e) {
                    System.err.println("❌ 语法错误 行" + line + ":" + charPositionInLine + " " + msg);
                    System.exit(1);
                }
            });

            // 5. 开始解析
            TaobaoDSLParser.ProgramContext tree = parser.program();

            if (parser.getNumberOfSyntaxErrors() > 0) {
                System.err.println("发现" + parser.getNumberOfSyntaxErrors() + "个语法错误");
                return;
            }

            // 6. 使用增强版Visitor执行
            DSLVisitorImpl visitor = new DSLVisitorImpl();
            visitor.visit(tree);

        } catch (Exception e) {
            System.err.println("程序执行出错: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static String readScriptFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}