package com.zx.factory.factorymethod.pizzastore.pizza;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-06
 * 设计模式
 * 工厂方法模式
 */

public class LDPepperPizza extends Pizza{
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("伦敦的胡椒pizza");
		System.out.println(" 伦敦的胡椒pizza 准备原材料");
	}
}