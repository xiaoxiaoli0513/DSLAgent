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
}

// 男装购物场景
scenario MensShopping {
    string welcome = "欢迎来到精品衣物男装专区！";
    print(welcome);
    
    showCatalog(filter = MENS);
    
    on intent("冬装") {
        print("为您推荐冬季男装：");
        recommend(for "MENS", season WINTER);
    }
}

// 女装购物场景
scenario WomensShopping {
    print("欢迎来到精品衣物女装专区！");
    
    on intent("羽绒服") {
        print("为您推荐女款羽绒服：");
        checkStock(down_jacket);
    }
}