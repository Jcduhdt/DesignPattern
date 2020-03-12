package com.zx.observer.improve;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-12
 * 设计模式
 * 观察者模式
 */
//观察者接口，有观察者来实现
public interface Observer {

	public void update(float temperature, float pressure, float humidity);
}
