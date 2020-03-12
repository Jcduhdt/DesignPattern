package com.zx.observer.improve;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-12
 * 设计模式
 * 观察者模式
 */
public class Client {

	public static void main(String[] args) {
		//创建一个WeatherData
		WeatherData weatherData = new WeatherData();

		//创建观察者
		CurrentConditions currentConditions = new CurrentConditions();
		BaiduSite baiduSite = new BaiduSite();

		//注册到weatherData
		weatherData.registerObserver(currentConditions);
		weatherData.registerObserver(baiduSite);

		//测试
		System.out.println("通知各个注册的观察者, 看看信息");
		weatherData.setData(10f, 100f, 30.3f);


		weatherData.removeObserver(currentConditions);
		//测试
		System.out.println();
		System.out.println("通知各个注册的观察者, 看看信息");
		weatherData.setData(10f, 100f, 30.3f);
	}

}
