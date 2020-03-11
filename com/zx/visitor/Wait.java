package com.zx.visitor;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-11
 * 设计模式
 * 访问者模式
 */
public class Wait extends Action {

	@Override
	public void getManResult(Man man) {
		System.out.println(" 男人给的评价是该歌手待定 ..");
	}

	@Override
	public void getWomanResult(Woman woman) {
		System.out.println(" 女人给的评价是该歌手待定 ..");
	}

}
