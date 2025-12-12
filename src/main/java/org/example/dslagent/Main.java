package org.example.dslagent;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.example.dslagent.interpreter.DSLVisitorImpl;
import org.example.dslagent.parser.TaobaoDSLLexer;
import org.example.dslagent.parser.TaobaoDSLParser;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        System.out.println("🛍️ 淘宝购物DSL解释器");
        System.out.println("======================");

        try {
            // 从文件读取脚本
            String scriptPath = args.length > 0 ? args[0] : "scripts/test.dsl";
            String scriptContent = readScriptFile(scriptPath);

            System.out.println("📖 读取脚本: " + scriptPath);
            System.out.println("----------------------");

            // 1. 词法分析
            TaobaoDSLLexer lexer = new TaobaoDSLLexer(CharStreams.fromString(scriptContent));

            // 2. 语法分析
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TaobaoDSLParser parser = new TaobaoDSLParser(tokens);

            // 3. 执行Visitor
            DSLVisitorImpl visitor = new DSLVisitorImpl();
            visitor.visit(parser.program());

            System.out.println("\n✅ 脚本执行完成！");
            System.out.println("======================");

        } catch (Exception e) {
            System.err.println("❌ 错误: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static String readScriptFile(String filePath) throws Exception {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}