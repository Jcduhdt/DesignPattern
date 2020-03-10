package com.zx.command;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-10
 * 设计模式
 * 命令模式  万能遥控
 */
//创建命令接口
public interface Command {

	//执行动作(操作)
	public void execute();
	//撤销动作(操作)
	public void undo();
}
