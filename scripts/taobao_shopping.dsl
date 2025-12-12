// 精品衣物店铺商品目录
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

catalog SummerCollection {
    product cotton_shirt {
        type = MENS;
        season = SUMMER;
        price = 199;
        stock = 100;
        description = "男士纯棉短袖衬衫";
    }
    
    product sundress {
        type = WOMENS;
        season = SUMMER;
        price = 299;
        stock = 80;
        description = "女士碎花连衣裙";
    }
    
    product kids_tshirt {
        type = KIDS;
        season = SUMMER;
        price = 89;
        stock = 120;
        description = "儿童卡通T恤";
    }
}

// 男装购物场景
scenario MensShopping {
    string welcome = "欢迎来到精品衣物男装专区！";
    print(welcome);
    
    showCatalog(filter = MENS);
    
    on intent("我想买冬装") {
        print("为您推荐冬季男装：");
        recommend(for "MENS", season WINTER, maxPrice 1000);
        
        if (has("大衣")) {
            print("我们有一款很受欢迎的男士羊毛大衣！");
            checkStock(wool_coat, 1);
        }
    }
    
    on intent("夏季穿搭") {
        print("夏季男装推荐：");
        recommend(for "MENS", season SUMMER);
    }
    
    on intent("查看价格") {
        int price = getPrice(wool_coat);
        print("男士羊毛大衣价格：" + price + "元");
    }
}

// 女装购物场景
scenario WomensShopping {
    print("欢迎来到精品衣物女装专区！");
    
    on intent("推荐裙子") {
        print("为您推荐女装裙装：");
        recommend(for "WOMENS", season SUMMER);
    }
    
    on intent("冬季保暖") {
        print("冬季女装保暖推荐：");
        recommend(for "WOMENS", season WINTER);
        
        if (getStock(down_jacket) > 0) {
            print("女士羽绒服有货，现在购买有优惠！");
        }
    }
}

// 童装购物场景  
scenario KidsShopping {
    print("欢迎来到精品衣物童装专区！");
    
    showCatalog(filter = KIDS);
    
    on intent("买童装") {
        print("童装推荐：");
        recommend(for "KIDS");
        
        // 根据季节推荐
        wait("请问需要冬季还是夏季童装？");
        
        if (has("冬")) {
            recommend(for "KIDS", season WINTER);
        } else if (has("夏")) {
            recommend(for "KIDS", season SUMMER);
        }
    }
    
    on intent("检查库存") {
        checkStock(kids_parka);
        checkStock(kids_tshirt);
    }
}

// 通用客服场景
scenario GeneralService {
    on intent("帮助" or "客服") {
        print("您好！我是精品衣物客服，请问需要什么帮助？");
        print("我可以帮您：1. 推荐商品 2. 查询价格 3. 查看库存 4. 浏览目录");
        
        wait("请告诉我您的需求：");
        
        if (has("推荐")) {
            recommend();
        } else if (has("价格")) {
            showCatalog();
        } else if (has("库存")) {
            print("请输入要查询的商品名称：");
        }
    }
    
    on intent("优惠" or "折扣") {
        print("当前店铺活动：");
        print("1. 冬季大衣全场8折");
        print("2. 夏季T恤买二送一");
        print("3. 新用户满300减50");
    }
}