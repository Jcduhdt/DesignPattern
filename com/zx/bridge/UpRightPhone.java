package com.zx.bridge;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-08
 * 设计模式
 * 桥接模式
 */
public class UpRightPhone extends Phone {

	//构造器
	public UpRightPhone(Brand brand) {
		super(brand);
	}

	@Override
	public void open() {
		super.open();
		System.out.println(" 直立样式手机 ");
	}

	@Override
	public void close() {
		super.close();
		System.out.println(" 直立样式手机 ");
	}

	@Override
	public void call() {
		super.call();
		System.out.println(" 直立样式手机 ");
	}
}