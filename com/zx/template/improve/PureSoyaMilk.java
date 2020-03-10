package com.zx.template.improve;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-10
 * 设计模式
 * 模板模式
 */
public class PureSoyaMilk extends SoyaMilk{

	@Override
	void addCondiments() {
		//空实现
	}

	@Override
	boolean customerWantCondiments() {
		return false;
	}

}
