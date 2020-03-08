package com.zx.jdksrc;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-08
 * 设计模式
 * 装饰者模式
 * 在JDK中的IO流中，FilterInputStream就是一个装饰着
 * DataInputStream为FilterInputStream的一个子类
 */
public class Decorator {
    public static void main(String[] args) throws Exception {

        //说明
        //1.InputStream是抽象类，类似之前讲的Drink
        //2.FileInputStream是InputStream的子类：类似之前的DeCaf、LongBlack
        //3.FilterInputStream是InputStream的子类，类似之前的Decorator修饰者
        //4.DataInputStream是FilterInputStream子类，具体的修饰者，类似之前的Milk，Soy
        //5.FilterInputStream类有protected volatile InputStream in; 即含被装饰者
        //6.分析得出在jdk的io体系中，就是使用的装饰者模式
        DataInputStream dis = new DataInputStream(new FileInputStream("d:\\abc.txt"));
        System.out.println(dis.read());
        dis.close();
    }
}
