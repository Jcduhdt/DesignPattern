package com.zx.mediator.smarthouse;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-12
 * 设计模式
 * 中介者模式
 */
//同事抽象类
public abstract class Colleague {
	private Mediator mediator;
	public String name;

	public Colleague(Mediator mediator, String name) {

		this.mediator = mediator;
		this.name = name;

	}

	public Mediator GetMediator() {
		return this.mediator;
	}

	public abstract void SendMessage(int stateChange);
}
