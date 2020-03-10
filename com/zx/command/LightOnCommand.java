package com.zx.command;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-10
 * 设计模式
 * 命令模式  万能遥控
 */
public class LightOnCommand implements Command {

	//聚合LightReceiver

	LightReceiver light;

	//构造器
	public LightOnCommand(LightReceiver light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		//调用接收者的方法
		light.on();
	}



	@Override
	public void undo() {
		//调用接收者的方法
		light.off();
	}

}
