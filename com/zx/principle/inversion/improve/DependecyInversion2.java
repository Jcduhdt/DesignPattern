package com.zx.principle.inversion.improve;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-05
 * 设计模式
 * 依赖倒转原则
 * 1.高层模块不应该依赖低层模块，二者都应该依赖其抽象
 * 2.抽象不应该依赖细节，细节应该依赖抽象
 * 3.依赖倒转(倒置)的中心思想是面向接口编程
 * 4. 依赖倒转原则是基于这样的设计理念：相对于细节的多变性，抽象的东西要稳定的多。以抽象为基础搭建的架构比
 * 以细节为基础的架构要稳定的多。在 java 中，抽象指的是接口或抽象类，细节就是具体的实现类
 * 5. 使用接口或抽象类的目的是制定好规范，而不涉及任何具体的操作，把展现细节的任务交给他们的实现类去完成
 */
public class DependecyInversion2 {
    public static void main(String[] args) {
        //客户端无需改变
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}

//定义接口
interface IReceiver {
    public String getInfo();
}

class Email implements IReceiver {
    @Override
    public String getInfo() {
        return "电子邮件信息: hello,world";
    }
}

//增加微信
class WeiXin implements IReceiver {
    @Override
    public String getInfo() {
        return "微信信息: hello,ok";
    }
}

//方式 2
class Person {
    //这里我们是对接口的依赖
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}