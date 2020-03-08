package com.zx.decorator;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-08
 * 设计模式
 * 装饰者模式
 */
public class Decorator extends Drink {
	private Drink obj;

	public Decorator(Drink obj) { //组合
		this.obj = obj;
	}

	@Override
	public float cost() {
		// getPrice 装饰者自己价格 + 被装饰者的价格
		return super.getPrice() + obj.cost();
	}

	@Override
	public String getDes() {
		// obj.getDes() 输出被装饰者的信息
		return des + " " + getPrice() + " && " + obj.getDes();
	}

}
