package com.zx.bridge;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-08
 * 设计模式
 * 桥接模式
 */
public class Vivo implements Brand {

	@Override
	public void open() {
		System.out.println(" Vivo手机开机 ");
	}

	@Override
	public void close() {
		System.out.println(" Vivo手机关机 ");
	}

	@Override
	public void call() {
		System.out.println(" Vivo手机打电话 ");
	}

}