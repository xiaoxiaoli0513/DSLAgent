// 商品目录定义
catalog WinterCollection {
    product wool_coat {
        type = MENS;
        season = WINTER;
        price = 899;
        stock = 50;
        description = "男士羊毛大衣";
    }
    
    product down_jacket {
        type = WOMENS;
        season = WINTER;
        price = 699;
        stock = 30;
        description = "女士羽绒服";
    }
    
    product kids_parka {
        type = KIDS;
        season = WINTER;
        price = 499;
        stock = 40;
        description = "儿童加厚冲锋衣";
    }
}

// 对话场景
scenario ShoppingGuide {
    string greeting = "欢迎来到精品衣物店铺！";
    print(greeting);
    
    print("请告诉我您的需求：");
    wait("输入您的需求");
    
    on intent("男装") {
        print("为您推荐男装：");
        recommend(for "MENS");
    }
    
    on intent("女装") {
        print("为您推荐女装：");
        recommend(for "WOMENS");
    }
    
    on intent("童装") {
        print("为您推荐童装：");
        recommend(for "KIDS");
    }
}