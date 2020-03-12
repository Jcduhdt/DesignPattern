package com.zx.mediator.smarthouse;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-12
 * 设计模式
 * 中介者模式
 */
public abstract class Mediator {
	//将给中介者对象，加入到集合中
	public abstract void Register(String colleagueName, Colleague colleague);

	//接收消息, 具体的同事对象发出
	public abstract void GetMessage(int stateChange, String colleagueName);

	public abstract void SendMessage();
}

