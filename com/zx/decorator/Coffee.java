package com.zx.decorator;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-08
 * 设计模式
 * 装饰者模式
 */

public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }


}
