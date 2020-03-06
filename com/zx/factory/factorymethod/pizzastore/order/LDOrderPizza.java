package com.zx.factory.factorymethod.pizzastore.order;

import com.zx.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import com.zx.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import com.zx.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-06
 * 设计模式
 * 工厂方法模式
 */

public class LDOrderPizza extends OrderPizza {

	
	@Override
	Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}
