package com.zyyh.market;

public class Goods {
    private final String apple;
    private final int price;
    private final GoodsType goodsType;

    public Goods(String apple, int price, GoodsType goodsType) {
        this.apple = apple;
        this.price = price;
        this.goodsType = goodsType;
    }

    public int getPrice() {
        return this.price;
    }

    public GoodsType getGoodsType() {
        return this.goodsType;
    }
}
