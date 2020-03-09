package com.zx.composite;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-09
 * 设计模式
 * 组合模式
 */
public abstract class OrganizationComponent {

	private String name; // 名字
	private String des; // 说明

	protected  void add(OrganizationComponent organizationComponent) {
		//默认实现，因为有些类（叶子节点），不需要重写add方法，
		// 若做成抽象，意味着叶子节点需要重写，不划算
		//抛出异常，是不支持操作,该方法由子类覆盖重写
		throw new UnsupportedOperationException();
	}

	protected  void remove(OrganizationComponent organizationComponent) {
		//默认实现
		throw new UnsupportedOperationException();
	}

	//构造器
	public OrganizationComponent(String name, String des) {
		super();
		this.name = name;
		this.des = des;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	//方法print, 做成抽象的, 子类都需要实现
	protected abstract void print();


}
