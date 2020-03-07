package com.zx.prototype;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-07
 * 设计模式
 * 原型模式 传统方法
 * 1.优点是比较好理解，简单易操作。
 * 2.在创建新的对象时，总是需要重新获取原始对象的属性，如果创建的对象比较复杂时，效率较低
 * 3.总是需要重新初始化对象，而不是动态地获得对象运行时的状态, 不够灵活
 * 4.解决办法
 * 思路： Java 中 Object 类是所有类的根类， Object 类提供了一个 clone()方法，该方法可以将一个 Java 对象复制
 * 一份，但是需要实现 clone 的 Java 类必须要实现一个接口 Cloneable，该接口表示该类能够复制且具有复制的能力 =>
 * 原型模式
 */
public class Client {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //传统的方法
        Sheep sheep = new Sheep("tom", 1, "白色");

        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep5 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        //....

        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
        //...
    }
}
