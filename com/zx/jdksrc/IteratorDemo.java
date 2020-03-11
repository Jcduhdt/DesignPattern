package com.zx.jdksrc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-11
 * 迭代器模式
 * ArrayList实现了iterator
 * 1.提供一个统一的方法遍历对象，客户不用再考虑聚合的类型，使用一种方法就可以遍历对象了。
 * 2.隐藏了聚合的内部结构，客户端要遍历聚合的时候只能取到迭代器，而不会知道聚合的具体组成。
 * 3.提供了一种设计思想，就是一个类应该只有一个引起变化的原因（叫做单一责任原则） 。在聚合类中，我们把
 * 迭代器分开，就是要把管理对象集合和遍历对象集合的责任分开，这样一来集合改变的话，只影响到聚合对象。而如
 * 果遍历方式改变的话，只影响到了迭代器。
 * 4.当要展示一组相似对象，或者遍历一组相同对象时使用, 适合使用迭代器模式
 * 缺点：每个聚合对象都要一个迭代器，会生成多个迭代器不好管理类
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("jack");
        //获取迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        LinkedList<String> list1 = new LinkedList<>();
    }
}
