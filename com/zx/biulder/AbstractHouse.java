package com.zx.biulder;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-07
 * 设计模式
 * 建造者模式
 */
public abstract class AbstractHouse {
    //打地基
    public abstract void buildBasic();
    //砌墙
    public abstract void buildWalls();
    //封顶
    public abstract void roofed();

    //建房的三个操作是有顺序的
    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
