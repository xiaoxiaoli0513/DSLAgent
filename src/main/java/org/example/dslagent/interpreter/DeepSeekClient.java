package org.example.dslagent.interpreter;

import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;
import java.util.Scanner;

public class DeepSeekClient {
    private static final String API_URL = "https://api.deepseek.com/v1/chat/completions";
    private static final String API_KEY = "sk-115f3801515b40cca58800b0e675fabd";
    private final OkHttpClient client;

    public DeepSeekClient() {
        this.client = new OkHttpClient();
    }

    /**
     * 调用DeepSeek API进行意图识别
     * @param userMessage 用户输入
     * @param scenarios 可用场景列表
     * @return 识别到的场景名称
     */
    public String recognizeIntent(String userMessage, String[] scenarios) {
        try {
            // 构建提示词
            String systemPrompt = buildIntentRecognitionPrompt(scenarios);

            // 构建请求体
            JSONObject requestBody = new JSONObject();
            requestBody.put("model", "deepseek-chat");
            requestBody.put("temperature", 0.3);
            requestBody.put("max_tokens", 100);

            JSONArray messages = new JSONArray();

            // 系统消息
            JSONObject systemMsg = new JSONObject();
            systemMsg.put("role", "system");
            systemMsg.put("content", systemPrompt);
            messages.put(systemMsg);

            // 用户消息
            JSONObject userMsg = new JSONObject();
            userMsg.put("role", "user");
            userMsg.put("content", userMessage);
            messages.put(userMsg);

            requestBody.put("messages", messages);

            // 发送请求
            Request request = new Request.Builder()
                    .url(API_URL)
                    .addHeader("Authorization", "Bearer " + API_KEY)
                    .addHeader("Content-Type", "application/json")
                    .post(RequestBody.create(
                            requestBody.toString(),
                            MediaType.parse("application/json")
                    ))
                    .build();

            Response response = client.newCall(request).execute();

            if (!response.isSuccessful()) {
                System.err.println("DeepSeek API调用失败: " + response.code());
                return "default";
            }

            String responseBody = response.body().string();
            JSONObject jsonResponse = new JSONObject(responseBody);

            // 解析响应
            JSONArray choices = jsonResponse.getJSONArray("choices");
            if (choices.length() > 0) {
                JSONObject choice = choices.getJSONObject(0);
                JSONObject message = choice.getJSONObject("message");
                String content = message.getString("content").trim();

                // 提取场景名称
                return extractScenarioName(content, scenarios);
            }

        } catch (IOException e) {
            System.err.println("调用DeepSeek API时出错: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("解析API响应时出错: " + e.getMessage());
        }

        return "default";
    }

    /**
     * 构建意图识别的提示词
     */
    private String buildIntentRecognitionPrompt(String[] scenarios) {
        StringBuilder prompt = new StringBuilder();
        prompt.append("你是一个淘宝购物助手，需要识别用户的意图并匹配到对应的场景。\n");
        prompt.append("可用场景列表：\n");

        for (int i = 0; i < scenarios.length; i++) {
            prompt.append(i + 1).append(". ").append(scenarios[i]).append("\n");
        }

        prompt.append("\n请根据用户的输入，判断最匹配的场景名称。\n");
        prompt.append("只返回场景名称，不要解释，不要添加其他内容。\n");
        prompt.append("如果没有匹配的场景，返回'default'。\n");
        prompt.append("示例：\n");
        prompt.append("用户输入：'我想买件外套'\n");
        prompt.append("输出：ClothingShopping\n");
        prompt.append("用户输入：'我要退款'\n");
        prompt.append("输出：AfterSales\n");

        return prompt.toString();
    }

    /**
     * 从API响应中提取场景名称
     */
    private String extractScenarioName(String content, String[] scenarios) {
        // 直接匹配场景名称
        for (String scenario : scenarios) {
            if (content.equalsIgnoreCase(scenario) ||
                    content.contains(scenario)) {
                return scenario;
            }
        }

        // 如果是数字，按索引返回
        try {
            int index = Integer.parseInt(content.trim());
            if (index > 0 && index <= scenarios.length) {
                return scenarios[index - 1];
            }
        } catch (NumberFormatException e) {
            // 不是数字，继续其他匹配
        }

        return "default";
    }

    /**
     * 获取用户键盘输入
     */
    public String getUserInput(Scanner scanner) {
        System.out.print("\n👤 您：");
        return scanner.nextLine();
    }

    /**
     * 调用DeepSeek进行自然语言回复
     */
    public String getChatResponse(String userMessage, String context) {
        try {
            JSONObject requestBody = new JSONObject();
            requestBody.put("model", "deepseek-chat");
            requestBody.put("temperature", 0.7);
            requestBody.put("max_tokens", 500);

            JSONArray messages = new JSONArray();

            // 系统消息 - 设置角色和上下文
            JSONObject systemMsg = new JSONObject();
            systemMsg.put("role", "system");
            systemMsg.put("content", "你是淘宝客服助手，热情专业地帮助用户解决问题。当前上下文：" + context);
            messages.put(systemMsg);

            // 用户消息
            JSONObject userMsg = new JSONObject();
            userMsg.put("role", "user");
            userMsg.put("content", userMessage);
            messages.put(userMsg);

            requestBody.put("messages", messages);

            // 发送请求
            Request request = new Request.Builder()
                    .url(API_URL)
                    .addHeader("Authorization", "Bearer " + API_KEY)
                    .addHeader("Content-Type", "application/json")
                    .post(RequestBody.create(
                            requestBody.toString(),
                            MediaType.parse("application/json")
                    ))
                    .build();

            Response response = client.newCall(request).execute();

            if (!response.isSuccessful()) {
                return "抱歉，我暂时无法回答这个问题。请尝试其他方式联系客服。";
            }

            String responseBody = response.body().string();
            JSONObject jsonResponse = new JSONObject(responseBody);

            JSONArray choices = jsonResponse.getJSONArray("choices");
            if (choices.length() > 0) {
                JSONObject choice = choices.getJSONObject(0);
                JSONObject message = choice.getJSONObject("message");
                return message.getString("content").trim();
            }

        } catch (Exception e) {
            System.err.println("获取聊天回复失败: " + e.getMessage());
        }

        return "抱歉，服务暂时不可用。";
    }
}
