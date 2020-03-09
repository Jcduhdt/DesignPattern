package com.zx.proxy.staticproxy;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-09
 * 设计模式
 * 代理模式 静态代理
 */
//代理对象,静态代理
public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao target; // 目标对象，通过接口来聚合


    //构造器
    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }


    @Override
    public void teach() {
        System.out.println("开始代理  完成某些操作。。。。。 ");//方法
        target.teach();
        System.out.println("提交。。。。。");//方法
    }

}
