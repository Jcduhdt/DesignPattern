package com.zx.jdksrc;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-15
 * 策略模式
 */
public class Strategy {
    public static void main(String[] args) {
        //数组
        Integer[] data = {9,1,2,8,4,3};
        //实现升序排序，返回-1放左边，1放右边，0保持不变

        //说明
        //1.实现Comparator接口（策略接口），匿名对象 new Comparator<Integer>(){}
        //2.对象new Comparator<Integer>(){..}就是实现了策略接口的对象
        //3.public int compare(Integer o1,Integer o2){}指定具体的处理方式
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1>o2){
                    return 1;
                }else {
                    return -1;
                }
            }
        };

        Arrays.sort(data,comparator);
        System.out.println(Arrays.toString(data));//升序

        //方式2- 同时lambda 表达式实现 策略模式
        Integer[] data2 = { 19, 11, 12, 18, 14, 13 };

        Arrays.sort(data2, (var1, var2) -> {
            if(var1.compareTo(var2) > 0) {
                return -1;
            } else {
                return 1;
            }
        });

        System.out.println("data2=" + Arrays.toString(data2));
    }
}
