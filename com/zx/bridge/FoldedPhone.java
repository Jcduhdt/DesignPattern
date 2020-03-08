package com.zx.bridge;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-08
 * 设计模式
 * 桥接模式
 */
//折叠式手机类，继承 抽象类 Phone
public class FoldedPhone extends Phone {

	//构造器
	public FoldedPhone(Brand brand) {
		super(brand);
	}

	@Override
	public void open() {
		super.open();
		System.out.println(" 折叠样式手机 ");
	}

	@Override
	public void close() {
		super.close();
		System.out.println(" 折叠样式手机 ");
	}

	@Override
	public void call() {
		super.call();
		System.out.println(" 折叠样式手机 ");
	}
}