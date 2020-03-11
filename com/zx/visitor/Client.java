package com.zx.visitor;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-11
 * 设计模式
 * 访问者模式
 * 这个问题里就是人与操作分开  各自抽取一个接口或抽象类进行实现，两者再相互调用
 */
public class Client {

	public static void main(String[] args) {
		//创建ObjectStructure
		ObjectStructure objectStructure = new ObjectStructure();

		objectStructure.attach(new Man());
		objectStructure.attach(new Woman());


		//成功
		Success success = new Success();
		objectStructure.display(success);

		System.out.println("===============");
		Fail fail = new Fail();
		objectStructure.display(fail);

		System.out.println("=======给的是待定的测评========");

		Wait wait = new Wait();
		objectStructure.display(wait);
	}

}
