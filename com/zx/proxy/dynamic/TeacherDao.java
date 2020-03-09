package com.zx.proxy.dynamic;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-09
 * 设计模式
 * 代理模式 动态代理之利用JDK的反射的Proxy实现动态代理
 */
public class TeacherDao implements ITeacherDao {

	@Override
	public void teach() {
		System.out.println(" 老师授课中.... ");
	}

	@Override
	public void sayHello(String name) {
		System.out.println("hello " + name);
	}

}
