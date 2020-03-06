package com.zx.jdksrc;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-06
 * 设计模式
 * 单例模式 分析JDK中使用的单例模式 Runtime饿汉式
 * java中会用到Runtime，所以不会造成内存浪费
 * 1.单例模式保证了 系统内存中该类只存在一个对象，节省了系统资源，对于一些需要频繁创建销毁的对象，使
 *   用单例模式可以提高系统性能
 * 2.当想实例化一个单例类的时候，必须要记住使用相应的获取对象的方法，而不是使用 new
 * 3.单例模式使用的场景：需要频繁的进行创建和销毁的对象、创建对象时耗时过多或耗费资源过多(即： 重量级
 *   对象)，但又经常用到的对象、 工具类对象、频繁访问数据库或文件的对象(比如数据源、 session 工厂等)
 */
public class Singleton {
    public static void main(String[] args) {
        //点进去看源码，发现是饿汉式
        Runtime runtime = Runtime.getRuntime();
    }
}
