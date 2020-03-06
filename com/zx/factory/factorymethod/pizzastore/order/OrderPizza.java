package com.zx.factory.factorymethod.pizzastore.order;

import com.zx.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-06
 * 设计模式
 * 工厂方法模式
 */


public abstract class OrderPizza {

	//定义一个抽象方法，createPizza , 让各个工厂子类自己实现
	abstract Pizza createPizza(String orderType);

	// 构造器
	public OrderPizza() {
		Pizza pizza = null;
		String orderType; // 订购披萨的类型
		//do/while不停的询问要点什么披萨，但是若输入的没有该选项，就会出错
		//应该直接运行一遍就行，try/catch若没有就输出没有该品种
		do {
			orderType = getType();
			pizza = createPizza(orderType); //抽象方法，由工厂子类完成
			//输出pizza 制作过程
			try {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			}catch (Exception e){
				System.out.println("没有该品种");
				break;
			}
		} while (true);
	}



	// 写一个方法，可以获取客户希望订购的披萨种类
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza 种类:");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
