package com.zx.singleton.type8;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-06
 * 设计模式
 * 单例模式 枚举实现
 * 1.这借助 JDK1.5 中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建
 * 新的对象。
 * 2.这种方式是 Effective Java 作者 Josh Bloch 提倡的方式
 * 3.结论：推荐使用
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode = " + instance.hashCode());
        System.out.println("instance.hashCode1 = " + instance2.hashCode());
        instance.sayOK();
    }
}

//枚举，可以实现单例，推荐
enum Singleton{
    INSTANCE;//属性
    public void sayOK(){
        System.out.println("ok~");
    }
}