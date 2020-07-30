package com.zyyh.market;

import java.util.List;

public class PointCalculatr {

    public int calculate(List<Goods> goods) {
        int totalPoints = 0;
        for (Goods singleGoods: goods) {
            if(singleGoods.getGoodsType().equals(GoodsType.PROMOTION)){
                totalPoints = singleGoods.getPrice()*2;
            } else if (singleGoods.getGoodsType().equals(GoodsType.NOPROMOTION)){
                totalPoints =  singleGoods.getPrice();
            }
        }

        return totalPoints;
    }
}
