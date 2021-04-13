package com.tiankai.controller;

public class shoppingcarbean {
    private  String goodsname;
    private  int basketballprice=88;
    private  int footballprice=66;

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }


    public String getGoodsname() {
        return goodsname;
    }

    public int getBasketballprice() {
        return basketballprice;
    }

    public int getFootballprice() {
        return footballprice;
    }

}
