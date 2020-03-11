package com.zx.visitor;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-11
 * 设计模式
 * 访问者模式
 */
public class Man extends Person {

	@Override
	public void accept(Action action) {
		action.getManResult(this);
	}

}
