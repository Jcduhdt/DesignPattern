package com.zx.iterator;

import java.util.Iterator;
import java.util.List;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-11
 * 设计模式
 * 迭代器模式
 */
public class InfoCollegeIterator implements Iterator {


	List<Department> departmentList; // 信息工程学院是以List方式存放系
	int index = -1;//索引


	public InfoCollegeIterator(List<Department> departmentList) {
		this.departmentList = departmentList;
	}

	//判断list中还有没有下一个元素
	@Override
	public boolean hasNext() {
		if(index >= departmentList.size() - 1) {
			return false;
		} else {
			//感觉有哪里不对
			index += 1;
			return true;
		}
	}

	@Override
	public Object next() {
		return departmentList.get(index);
	}

	//空实现remove
	@Override
	public void remove() {

	}

}
