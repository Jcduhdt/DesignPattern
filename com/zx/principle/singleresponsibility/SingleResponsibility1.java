package com.zx.principle.singleresponsibility;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-05
 * 设计模式
 * 单一职责原则
 * 降低类的复杂度，一个类负责一个职责
 * 三种方式的演变过程分析
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

// 交通工具类
// 方 式 1
// 1. 在方式 1 的 run 方法中，违反了单一职责原则
// 2. 解决的方案非常的简单，根据交通工具运行方法不同，分解成不同类即可=>方案二
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行....");
    }
}
