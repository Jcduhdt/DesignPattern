package com.zx.jdksrc;

import java.util.Calendar;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-06
 * JDK 中的 Calendar 类中，就使用了简单工厂模式
 */
public class Factory {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //自己debug一下
        // getInstance 是 Calendar 静态方法
        Calendar cal = Calendar.getInstance();
        // 注意月份下标从0开始，所以取月份要+1
        System.out.println("年:" + cal.get(Calendar.YEAR));
        System.out.println("月:" + (cal.get(Calendar.MONTH) + 1));
        System.out.println("日:" + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("时:" + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("分:" + cal.get(Calendar.MINUTE));
        System.out.println("秒:" + cal.get(Calendar.SECOND));
    }
}
