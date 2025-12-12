catalog Clothing {
    product Jacket {
        type = MENS;
        season = WINTER;
        price = 299;
        stock = 50;
        description = "冬季保暖夹克";
    }
    
    product TShirt {
        type = UNISEX;
        season = SUMMER;
        price = 89;
        stock = 200;
        description = "纯棉短袖T恤";
    }
    
    product Dress {
        type = WOMENS;
        season = SUMMER;
        price = 399;
        stock = 30;
        description = "夏季连衣裙";
    }
}

catalog Electronics {
    product Phone {
        type = UNISEX;
        season = ALL_SEASON;
        price = 2999;
        stock = 20;
        description = "智能手机";
    }
    
    product Headphones {
        type = UNISEX;
        season = ALL_SEASON;
        price = 499;
        stock = 100;
        description = "无线蓝牙耳机";
    }
}

// 服装购物场景
scenario ClothingShopping {
    print("欢迎来到服装区！");
    print("我们这里有各种时尚服装。");
    
    wait("您想要什么类型的衣服呢？");
    
    on intent("外套") {
        recommend(season WINTER, maxPrice 500);
        showCatalog(filter=MENS);
    }
    
    on intent("T恤") {
        recommend(season SUMMER, maxPrice 200);
        showCatalog(filter=UNISEX);
    }
    
    on intent("裙子") {
        recommend(for "女士", season SUMMER);
        showCatalog(filter=WOMENS);
    }
}

// 电子产品购物场景
scenario ElectronicsShopping {
    print("欢迎来到电子产品区！");
    print("这里有最新的数码产品。");
    
    wait("您对什么产品感兴趣？");
    
   
    
    on intent("手机") {
        int inventory = getStock(Phone);  // 原来是stock
        print("手机库存：" + inventory + "台");
        
        int cost = getPrice(Phone);  // 原来是price
        print("当前价格：" + cost + "元");
    }
    
    on intent("耳机") {
        checkStock(Headphones, 1);
        int cost = getPrice(Headphones);  // 原来是price
        print("耳机价格：" + cost + "元");
    }
}

// 售后服务场景
scenario AfterSales {
    print("您好，这里是售后服务。");
    
    wait("请问您需要什么帮助？");
    
    on intent("退货") {
        print("请提供订单号，我们会尽快处理您的退货申请。");
        print("退货政策：7天无理由退货。");
    }
    
    on intent("退款") {
        print("退款申请已提交，预计3-5个工作日到账。");
    }
    
    on intent("换货") {
        print("换货需要商品保持完好，请确认商品状态。");
    }
}

// 物流查询场景
scenario Logistics {
    print("物流查询服务");
    
    wait("请输入您的订单号：");
    
    print("正在查询物流信息...");
    
    string logisticsInfo = "包裹已发货，预计明天送达";
    print("物流状态：" + logisticsInfo);
}

// 价格协商场景
scenario PriceNegotiation {
    print("价格优惠咨询");
    
    wait("您看中了哪款商品？");
    
    on intent("优惠") {
        print("现在有满300减30的活动！");
        print("会员还可以享受额外9折优惠。");
    }
    
    on intent("便宜") {
        print("这款已经是特价商品了。");
        print("您可以考虑购买套餐，更划算。");  // 修正：printni → print
    }
}