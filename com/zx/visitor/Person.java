package com.zx.visitor;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-11
 * 设计模式
 * 访问者模式
 */
public abstract class Person {

	//提供一个方法，让访问者可以访问
	public abstract void accept(Action action);
}
