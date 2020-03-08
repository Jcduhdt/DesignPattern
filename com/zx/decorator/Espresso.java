package com.zx.decorator;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-08
 * 设计模式
 * 装饰者模式
 */
public class Espresso extends Coffee {

	//点咖啡的时候就给他
	public Espresso() {
		setDes(" 意大利咖啡 ");
		setPrice(6.0f);
	}
}