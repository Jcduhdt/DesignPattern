package com.zx.iterator;

import java.util.ArrayList;
import java.util.List;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-11
 * 设计模式
 * 迭代器模式
 */
public class Client {

	public static void main(String[] args) {
		//创建学院
		List<College> collegeList = new ArrayList<College>();

		ComputerCollege computerCollege = new ComputerCollege();
		InfoCollege infoCollege = new InfoCollege();

		collegeList.add(computerCollege);
		collegeList.add(infoCollege);

		OutPutImpl outPutImpl = new OutPutImpl(collegeList);
		outPutImpl.printCollege();
	}

}
