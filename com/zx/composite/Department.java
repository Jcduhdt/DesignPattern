package com.zx.composite;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-09
 * 设计模式
 * 组合模式
 */
public class Department extends OrganizationComponent {

	//没有集合

	public Department(String name, String des) {
		super(name, des);
	}


	//add , remove 就不用写了，因为他是叶子节点

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public String getDes() {
		return super.getDes();
	}

	@Override
	protected void print() {
		System.out.println(getName());
	}

}
