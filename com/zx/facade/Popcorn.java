package com.zx.facade;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-09
 * 设计模式
 * 外观模式
 */

//爆米花机
public class Popcorn {
	
	private static Popcorn instance = new Popcorn();
	
	public static Popcorn getInstance() {
		return instance;
	}
	
	public void on() {
		System.out.println(" popcorn on ");
	}
	
	public void off() {
		System.out.println(" popcorn ff ");
	}
	
	public void pop() {
		System.out.println(" popcorn is poping  ");
	}
}
