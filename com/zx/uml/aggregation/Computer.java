package com.zx.uml.aggregation;

//聚合关系，关联关系的特例，导航性和多重性
public class Computer {
	private Mouse mouse;  //鼠标可以和computer分离
	private Moniter moniter;//显示器可以和Computer分离
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public void setMoniter(Moniter moniter) {
		this.moniter = moniter;
	}
	
}
