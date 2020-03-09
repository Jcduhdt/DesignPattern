package com.zx.jdksrc;

import java.util.HashMap;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-09
 * 设计模式
 * 组合模式
 * 在jdk中的应用 HashMap
 * Map -> AbstractMap -> HashMap -> Node
 */
public class Composite {
    public static void main(String[] args) {

        //说明
        //1.Map就是一个抽象的构建（类似Component）
        //2.HashMap是一个中间构建（composite），实现/继承了相关方法put，putAll
        //3.Node是HashMap的静态内部类，类似Leaf叶子节点，这里就没有put，putAll
        //  static class Node<K,V> implements Map.Entry<K,V>
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0,"东游记");//直接存放在叶子节点

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"西游记");
        map.put(2,"红楼梦");
        hashMap.putAll(map);//将map的东西全部放进hashMap
        System.out.println(hashMap);
    }
}
