package com.zx.proxy.cjlib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-09
 * 设计模式
 * 代理模式 动态代理之cjlib代理
 * 1.静态代理和 JDK 代理模式都要求目标对象是实现一个接口,但是有时候目标对象只是一个单独的对象,并没有实
 * 现任何的接口,这个时候可使用目标对象子类来实现代理-这就是 Cglib 代理
 * 2.Cglib代理也叫作子类代理,它是在内存中构建一个子类对象从而实现对目标对象功能扩展, 有些书也将Cglib代
 * 理归属到动态代理。
 * 3.Cglib 是一个强大的高性能的代码生成包,它可以在运行期扩展 java 类与实现 java 接口.它广泛的被许多 AOP 的
 * 框架使用,例如 Spring AOP，实现方法拦截
 * 4.在 AOP 编程中如何选择代理模式：
 * 		4.1目标对象需要实现接口，用 JDK 代理
 * 		4.2目标对象不需要实现接口，用 Cglib 代理
 * 5.Cglib 包的底层是通过使用字节码处理框架 ASM 来转换字节码并生成新的类
 * 需要引入 cglib 的 jar 文件
 * 在内存中动态构建子类，注意代理的类不能为 final，否则报错
 * java.lang.IllegalArgumentException:
 * 目标对象的方法如果为 final/static,那么就不会被拦截,即不会执行目标对象额外的业务方法
 */
public class ProxyFactory implements MethodInterceptor {

	//维护一个目标对象
	private Object target;

	//构造器，传入一个被代理的对象
	public ProxyFactory(Object target) {
		this.target = target;
	}

	//返回一个代理对象:  是 target 对象的代理对象
	public Object getProxyInstance() {
		//1. 创建一个工具类
		Enhancer enhancer = new Enhancer();
		//2. 设置父类
		enhancer.setSuperclass(target.getClass());
		//3. 设置回调函数
		enhancer.setCallback(this);
		//4. 创建子类对象，即代理对象
		return enhancer.create();

	}


	//重写  intercept 方法，会调用目标对象的方法
	@Override
	public Object intercept(Object arg0, Method method, Object[] args, MethodProxy arg3) throws Throwable {
		System.out.println("Cglib代理模式 ~~ 开始");
		Object returnVal = method.invoke(target, args);
		System.out.println("Cglib代理模式 ~~ 提交");
		return returnVal;
	}

}
