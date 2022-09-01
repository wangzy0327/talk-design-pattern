package com.wzy.prototype.deepclone;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable, Cloneable {
	
	/**
	 * Java的序列化机制是通过类的serversionUID来验证版本一致性的。
	 * 在反序列化时，JVM会将传来的字节流中的serialVersionUID与本地相应实体类的serialVersionUID进行比较，如果相同就认为是一致的，可以进行反序列化，
	 * 否则就会出现序列化版本不一致的异常，即是InvalidCastException
	 *
	 *
	 * serialVersionUID有三种常见的生成方案：
	 *
	 * 根据类名、接口名、成员方法及属性等来生成一个64位的哈希字段，比如：
	 * 1.private static final long serialVersionUID = xxxL；
	 * 2.默认的1L，比如：private static final long serialVersionUID = 1L；
	 * 3.完全随机生成；
	 * 关于三种方案的解析：
	 *
	 * 第一种方案：没有手动声明serialVersionUID时java的默认策略，serialVersionUID的默认值完全依赖于Java编译器的实现，对于同一个类，用不同的Java编译器编译，有可能会导致不同的serialVersionUID。
	 * 通常如果Class文件（类名、方法名等）没有发生变化（增加空格、换行、增加注释等等），就算编译多次，servialVersionUID也不会变化的。
	 *
	 * 第二种方案：当场景没有特殊要求时可以使用这种方案。
	 *
	 * 第三种方案：通常是为了保证序列化安全，假设serialVersionUID很容易被猜到，那么其他人就很容易反序列化该对象得到对象中保存的信息。所以当使用场景涉及到安全问题时，我们尽量保证serialVersionUID随机。
	 *
	 *

	 */
	private static final long serialVersionUID = 1L;

	private String cloneName;

	private String cloneClass;

	//构造器
	public DeepCloneableTarget(String cloneName, String cloneClass) {
		this.cloneName = cloneName;
		this.cloneClass = cloneClass;
	}

	//该类的属性，都是String，因此我们这里使用浅拷贝
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
