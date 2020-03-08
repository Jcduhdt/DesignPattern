package com.zx.adapter.classadapter;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-08
 * 设计模式
 * 适配器模式 类适配器
 */
//适配器类 继承220V 实现5V的接口
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

	@Override
	public int output5V() {
		//获取到220V电压
		int srcV = output220V();
		int dstV = srcV / 44 ; //转成 5v
		return dstV;
	}

}
