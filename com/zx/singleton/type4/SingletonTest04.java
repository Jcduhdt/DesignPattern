package com.zx.singleton.type4;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-06
 * 设计模式
 * 单例模式 懒汉式 线程安全
 * 1.解决了线程安全问题
 * 2.效率太低了，每个线程在想获得类的实例时候，执行 getInstance()方法都要进行同步。而其实这个方法只执行
 *   一次实例化代码就够了，后面的想获得该类实例，直接 return 就行了。方法进行同步效率太低
 * 3.结论：在实际开发中，不推荐使用这种方式
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        //测试
        System.out.println("懒加载，线程安全");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);//true
        System.out.println("instance.hashCode = " + instance.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

//懒汉式 线程安全
class Singleton{
    private Singleton(){

    }
    private static Singleton instance;

    //懒加载，要用的时候才创建 加锁
    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
