// 商品目录定义
catalog WinterCollection {
    product wool_coat {
        type = MENS;
        season = WINTER;
        price = 899;
        stock = 50;
        description = "男士羊毛大衣，保暖有型";
    }
    
    product down_jacket {
        type = WOMENS;
        season = WINTER;
        price = 699;
        stock = 30;
        description = "女士羽绒服，轻薄保暖";
    }
    
    product kids_parka {
        type = KIDS;
        season = WINTER;
        price = 499;
        stock = 40;
        description = "儿童加厚冲锋衣";
    }
}

// 男装购物场景
scenario MensShopping {
    string welcome = "欢迎来到精品衣物男装专区！";
    print(welcome);
    
    showCatalog(filter = MENS);
    
    on intent("冬装") {
        print("为您推荐冬季男装：");
        recommend(for "MENS", season WINTER, maxPrice 1000);
        
        print("推荐男士羊毛大衣，现在购买有优惠！");
        checkStock(wool_coat);
        
        int price = getPrice(wool_coat);
        print("当前价格：" + price + "元");
    }
    
    on intent("价格") {
        print("商品价格查询：");
        int coatPrice = getPrice(wool_coat);
        print("羊毛大衣价格：" + coatPrice + "元");
    }
}

// 女装购物场景
scenario WomensShopping {
    print("欢迎来到精品衣物女装专区！");
    
    on intent("裙子") {
        print("为您推荐女装裙装：");
        showCatalog(filter = WOMENS);
    }
    
    on intent("库存") {
        print("检查女装库存：");
        checkStock(down_jacket);
    }
}