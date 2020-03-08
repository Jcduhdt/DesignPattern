package com.zx.adapter.objectadapter;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-08
 * 设计模式
 * 适配器模式 对象适配器
 */
//适配器类 实现5V的接口
public class VoltageAdapter implements IVoltage5V {
	private Voltage220V voltage220V;

	//通过构造器，传入一个Voltages220V实例
	public VoltageAdapter(Voltage220V voltage220V) {
		this.voltage220V = voltage220V;
	}

	@Override
	public int output5V() {
		int dst = 0;
		if (null != voltage220V){
			int src = voltage220V.output220V();//获取220V电压
			System.out.println("使用对象适配器，进行适配");
			dst = src / 44;
			System.out.println("适配完成，输出电压为=" + dst);
		}
		return dst;
	}
}
