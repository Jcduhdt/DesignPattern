package com.zx.command;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-10
 * 设计模式
 * 命令模式  万能遥控
 */
public class TVOffCommand implements Command {

	// 聚合TVReceiver

	TVReceiver tv;

	// 构造器
	public TVOffCommand(TVReceiver tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void execute() {
		// 调用接收者的方法
		tv.off();
	}

	@Override
	public void undo() {
		// 调用接收者的方法
		tv.on();
	}
}
