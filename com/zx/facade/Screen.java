package com.zx.facade;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-09
 * 设计模式
 * 外观模式
 */
public class Screen {

	private static Screen instance = new Screen();
	
	public static Screen getInstance() {
		return instance;
	}

	
	public void up() {
		System.out.println(" Screen up ");
	}
	
	public void down() {
		System.out.println(" Screen down ");
	}

}
