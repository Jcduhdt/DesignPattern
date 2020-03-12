package com.zx.mediator.smarthouse;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-12
 * 设计模式
 * 中介者模式
 */
public class TV extends Colleague {

	public TV(Mediator mediator, String name) {
		super(mediator, name);
		mediator.Register(name, this);
	}

	@Override
	public void SendMessage(int stateChange) {
		this.GetMediator().GetMessage(stateChange, this.name);
	}

	public void StartTv() {
		System.out.println("It's time to StartTv!");
	}

	public void StopTv() {
		System.out.println("StopTv!");
	}
}
