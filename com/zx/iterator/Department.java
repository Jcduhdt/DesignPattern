package com.zx.iterator;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-11
 * 设计模式
 * 迭代器模式
 */
//系
public class Department {

	private String name;
	private String desc;
	public Department(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	
}
