package com.zx.singleton.type6;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-06
 * 设计模式
 * 单例模式 懒汉式 双重检查
 * 1.Double-Check 概念是多线程开发中常使用到的，如代码中所示，我们进行了两次 if (singleton == null)检查，这
 *   样就可以保证线程安全了。
 * 2.这样，实例化代码只用执行一次，后面再次访问时，判断 if (singleton == null)，直接 return 实例化对象，也避
 *   免的反复进行方法同步.
 * 3.线程安全；延迟加载；效率较高
 * 4.结论：在实际开发中，推荐使用这种单例设计模式
 */
public class SingletonTest06 {
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
    //加volatile修饰，当instance有改动时，直接再加到主存
    private static volatile Singleton instance;

    //懒加载，要用的时候才创建 加锁
    //双重检查，只有第一次创建的时候才加锁同步，解决了线程安全问题 懒加载问题 保证了效率
    //之后的因为实例存在，在if那里就直接跳过，返回了
    public static synchronized Singleton getInstance(){
        if (instance == null){
            synchronized(Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
