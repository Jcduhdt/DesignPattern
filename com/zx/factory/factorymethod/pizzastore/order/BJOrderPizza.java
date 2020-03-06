package com.zx.factory.factorymethod.pizzastore.order;

import com.zx.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.zx.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.zx.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-06
 * 设计模式
 * 工厂方法模式
 */

public class BJOrderPizza extends OrderPizza {

	
	@Override
	Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}
