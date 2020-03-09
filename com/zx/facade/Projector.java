package com.zx.facade;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-09
 * 设计模式
 * 外观模式
 */
//投影仪
public class Projector {

	private static Projector instance = new Projector();
	
	public static Projector getInstance() {
		return instance;
	}
	
	public void on() {
		System.out.println(" Projector on ");
	}
	
	public void off() {
		System.out.println(" Projector ff ");
	}
	
	public void focus() {
		System.out.println(" Projector is Projector  ");
	}
	
	//...
}
