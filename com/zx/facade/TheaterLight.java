package com.zx.facade;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-09
 * 设计模式
 * 外观模式
 */
public class TheaterLight {

	private static TheaterLight instance = new TheaterLight();

	public static TheaterLight getInstance() {
		return instance;
	}

	public void on() {
		System.out.println(" TheaterLight on ");
	}

	public void off() {
		System.out.println(" TheaterLight off ");
	}

	public void dim() {
		System.out.println(" TheaterLight dim.. ");
	}

	public void bright() {
		System.out.println(" TheaterLight bright.. ");
	}
}
