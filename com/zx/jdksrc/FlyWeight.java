package com.zx.jdksrc;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-09
 * 设计模式
 * 享元模式
 *
 */
public class FlyWeight {
    public static void main(String[] args) {
        //小结
        //1.在valueOf方法中，先判断值是否在IntegerCache中，如果不在就创建新的Integer(new)，否则就直接从缓存池返回
        //2.valueOf方法，就使用到享元模式
        //3.如果使用valueOf方法得到的一个Integer实例，范围是在-128~127，执行速度比new快

        //如果Integer.valueOf(x) x在-128~127之间，就是享元模式返回
        //不是则返回的是new的一个对象
        //追进valueOf看源码
        Integer x = Integer.valueOf(127);//x实例，类型Integer
        Integer y = new Integer(127);//y实例，类型Integer
        Integer z = Integer.valueOf(127);
        Integer w = new Integer(127);

        System.out.println(x.equals(y));//大小 true
        System.out.println(x == y);//false
        System.out.println(x == z);//true
        System.out.println(w == z);//false
        System.out.println(w == y);//false

        Integer x1 = Integer.valueOf(200);
        Integer x2 = Integer.valueOf(200);
        System.out.println(x1 == x2);//false
    }
}
