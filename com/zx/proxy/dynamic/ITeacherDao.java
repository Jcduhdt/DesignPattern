package com.zx.proxy.dynamic;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-09
 * 设计模式
 * 代理模式 动态代理之利用JDK的反射的Proxy实现动态代理
 */
//接口
public interface ITeacherDao {

	void teach(); // 授课方法
	void sayHello(String name);
}