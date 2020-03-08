package com.zx.adapter.interfaceadapter;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-08
 * 设计模式
 * 适配器模式 接口适配器
 */
public class Client {
	public static void main(String[] args) {

		AbsAdapter absAdapter = new AbsAdapter() {
			//只需要去覆盖我们 需要使用 接口方法
			@Override
			public void m1() {
				System.out.println("使用了m1的方法");
			}
		};

		absAdapter.m1();
	}
}
