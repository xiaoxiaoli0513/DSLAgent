// 简单测试脚本
scenario Test {
    print("测试开始");
    
    // 变量声明和赋值
    string name = "精品衣物店铺";
    print(name);
    
    // 等待用户输入
    wait("请输入您的需求");
    
    // 简单的意图规则
    on intent("help") {
        print("欢迎使用帮助");
        print("请输入您的需求");
    }
}