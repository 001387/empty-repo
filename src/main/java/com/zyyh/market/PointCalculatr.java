package com.zyyh.market;

public class PointCalculatr {

    public int calculate(Goods goods) {
        int totalPoints = 0;
        if(goods.getGoodsType().equals(GoodsType.PROMOTION)){
            totalPoints = goods.getPrice()*2;
        } else if (goods.getGoodsType().equals(GoodsType.NOPROMOTION)){
            totalPoints =  goods.getPrice();
        }
        return totalPoints;
    }
}
