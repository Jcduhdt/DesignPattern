package com.zx.singleton.type1;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-06
 * 设计模式
 * 单例模式 饿汉模式 静态常量
 * 优点：类装载的时候就完成实例化。避免了线程同步问题
 * 缺点：在类装载的时候就完成实例化，没有达到 Lazy Loading 的效果。如果从始至终从未使用过这个实例，则
 * 会造成内存的浪费
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);//true
        System.out.println("instance.hashCode = " + instance.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

//饿汉式 静态变量
class Singleton{
    //1.构造器私有化,外部不能new
    private Singleton(){

    }

    //2.本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    //3.提供一个共有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}
