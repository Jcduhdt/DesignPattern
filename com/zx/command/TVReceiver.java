package com.zx.command;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-10
 * 设计模式
 * 命令模式  万能遥控
 */
public class TVReceiver {

	public void on() {
		System.out.println(" 电视机打开了.. ");
	}

	public void off() {
		System.out.println(" 电视机关闭了.. ");
	}
}