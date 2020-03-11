package com.zx.visitor;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-11
 * 设计模式
 * 访问者模式
 */
public abstract class Action {

	//得到男性 的测评
	public abstract void getManResult(Man man);

	//得到女的 测评
	public abstract void getWomanResult(Woman woman);
}
