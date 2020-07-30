package com.zyyh.market;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MarketTest {
        @Test
    public void should_return_100_points_when_buy_goods_given_100_privce(){
//        given
        Goods apple = new Goods("Apple",100, GoodsType.NOPROMOTION);
        PointCalculatr pointCalaulatr = new PointCalculatr();
        List<Goods> goods = new ArrayList<Goods>();
        goods.add(apple);
//        when
        int points = pointCalaulatr.calculate(goods);
//        then
        assertThat(points, is(100));
    }
    @Test
    public void should_return_110_points_when_buy_goods_given_110_privce() {
//        given
        Goods apple = new Goods("Apple",110, GoodsType.NOPROMOTION);
        PointCalculatr pointCalaulatr = new PointCalculatr();
        List<Goods> goods = new ArrayList<Goods>();
        goods.add(apple);

//        when
        int points = pointCalaulatr.calculate(goods);
//        then
        assertThat(points, is(110));
    }

    @Test
    public void should_return_20_points_when_buy_promotional_goods_apple_10yuan(){
//        given
        Goods apple = new Goods("Apple",10, GoodsType.PROMOTION);
        PointCalculatr pointCalaulatr = new PointCalculatr();
        List<Goods> goods = new ArrayList<Goods>();
        goods.add(apple);

//        when
        int points = pointCalaulatr.calculate(goods);
//        then
        assertThat(points, is(20));
    }

}
