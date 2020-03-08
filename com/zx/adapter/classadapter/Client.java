package com.zx.adapter.classadapter;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-08
 * 设计模式
 * 适配器模式 类适配器
 */
public class Client {

	public static void main(String[] args) {
		System.out.println(" === 类适配器模式 ====");
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter());
	}

}
