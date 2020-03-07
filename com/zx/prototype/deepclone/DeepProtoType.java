package com.zx.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-07
 * 设计模式
 * 原型模式  深拷贝
 */

public class DeepProtoType implements Serializable, Cloneable{

	public String name; //String 属性
	public DeepCloneableTarget deepCloneableTarget;// 引用类型
	public DeepProtoType() {
		super();
	}


	/**
	 * 深拷贝 - 方式 1 使用clone 方法
	 * 就是分两步，第一步先将目标的基本类型利用Object的clone进行拷贝
	 * 第二步就是单独对其引用对象进行拷贝，将拷贝的结果赋值到这个的引用变量
	 * 但是很麻烦，要一个个对引用对象进行克隆
	 * 看拷贝是否成功，即看拷贝的结果的引用对象的hashCode是否相同
	 * @return
	 * @throws CloneNotSupportedException
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {

		Object deep = null;
		//这里完成对基本数据类型(属性)和String的克隆
		deep = super.clone();
		//对引用类型的属性，进行单独处理
		DeepProtoType deepProtoType = (DeepProtoType)deep;
		deepProtoType.deepCloneableTarget  = (DeepCloneableTarget)deepCloneableTarget.clone();

		return deepProtoType;
	}


	/**
	 * 深拷贝 - 方式2 通过对象的序列化实现 (推荐)
	 * 以对象的方式进行序列化，以对象的方式读取
	 * 还要思考一下
	 * @return
	 */
	public Object deepClone() {

		//创建流对象，因为使用的是序列化
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;

		try {

			//序列化
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this); //当前这个对象以对象流的方式输出

			//反序列化
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			DeepProtoType copyObj = (DeepProtoType)ois.readObject();

			return copyObj;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			//关闭流
			try {
				bos.close();
				oos.close();
				bis.close();
				ois.close();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}

	}

}
