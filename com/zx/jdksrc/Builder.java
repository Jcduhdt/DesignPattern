package com.zx.jdksrc;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-07
 * 设计模式
 * 建造者模式
 * 追溯源码
 * 源码中建造者模式角色分析
 * 1.Appendable 接口定义了多个 append 方法(抽象方法), 即 Appendable 为抽象建造者, 定义了抽象方法
 * 2.AbstractStringBuilder 实现了 Appendable 接口方法，这里的 AbstractStringBuilder 已经是建造者， 只是不能
 * 实例化
 * 3.StringBuilder 即充当了指挥者角色，同时充当了具体的建造者，建造方法的实现是由 AbstractStringBuilder 完
 * 成 , 而 StringBuilder 继承了 AbstractStringBuilder
 */
public class Builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("hello,world");
        System.out.println(builder);
    }
}
