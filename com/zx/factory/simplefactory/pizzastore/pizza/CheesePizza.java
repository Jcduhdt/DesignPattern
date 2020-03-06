package com.zx.factory.simplefactory.pizzastore.pizza;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-06
 * 设计模式
 * 工厂模式
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        System.out.println(" 给制作奶酪披萨 准备原材料 ");
    }

}
