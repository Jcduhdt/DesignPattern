package com.zx.facade;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-09
 * 设计模式
 * 外观模式
 * 感觉就像 一个按键按下去然后对应按键指定的任务进行处理
 * 这种方式很固定，要为指定按键分配固定任务，虽然是一键完成多任务
 *
 * Mybatis 中的 Configuration 去创建 MetaObject 对象使用到外观模式
 */
public class Client {

	public static void main(String[] args) {
		//这里直接调用。。 很麻烦
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
		homeTheaterFacade.ready();
		homeTheaterFacade.play();
		homeTheaterFacade.end();
	}

}