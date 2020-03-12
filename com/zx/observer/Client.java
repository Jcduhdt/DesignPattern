package com.zx.observer;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-12
 * 设计模式
 * 观察者模式
 */
public class Client {
	public static void main(String[] args) {
		//创建接入方 currentConditions
		CurrentConditions currentConditions = new CurrentConditions();
		//创建 WeatherData 并将 接入方 currentConditions 传递到 WeatherData中
		WeatherData weatherData = new WeatherData(currentConditions);

		//更新天气情况
		weatherData.setData(30, 150, 40);

		//天气情况变化
		System.out.println("============天气情况变化=============");
		weatherData.setData(40, 160, 20);


	}
}
