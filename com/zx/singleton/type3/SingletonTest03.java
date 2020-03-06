package com.zx.singleton.type3;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-06
 * 设计模式
 * 单例模式 懒汉式 线程不安全
 * 1.起到了 Lazy Loading 的效果，但是只能在单线程下使用。
 * 2.如果在多线程下，一个线程进入了 if (singleton == null)判断语句块，还未来得及往下执行，另一个线程也通过
 *   了这个判断语句，这时便会产生多个实例。所以在多线程环境下不可使用这种方式
 * 3.结论：在实际开发中，不要使用这种方式.
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);//true
        System.out.println("instance.hashCode = " + instance.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

//懒汉式 线程不安全
class Singleton{
    private Singleton(){

    }
    private static Singleton instance;

    //懒加载，要用的时候才创建
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
