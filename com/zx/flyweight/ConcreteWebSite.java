package com.zx.flyweight;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-09
 * 设计模式
 * 享元模式 池技术的实现
 */
//具体网站
public class ConcreteWebSite extends WebSite {

	//共享的部分，内部状态
	private String type = ""; //网站发布的形式(类型)


	//构造器
	public ConcreteWebSite(String type) {

		this.type = type;
	}


	@Override
	public void use(User user) {
		System.out.println("网站的发布形式为:" + type + " 在使用中 .. 使用者是" + user.getName());
	}


}