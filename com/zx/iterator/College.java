package com.zx.iterator;

import java.util.Iterator;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-11
 * 设计模式
 * 迭代器模式
 */
public interface College {

	public String getName();

	//增加系的方法
	public void addDepartment(String name, String desc);

	//返回一个迭代器,遍历
	public Iterator  createIterator();
}
