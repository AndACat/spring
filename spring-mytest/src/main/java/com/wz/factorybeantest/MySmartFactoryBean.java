package com.wz.factorybeantest;

import com.wz.pojo.Student;
import org.springframework.beans.factory.SmartFactoryBean;
import org.springframework.stereotype.Component;

/**
 * eagerInit为true表明该getObject()方法将会被优先创建
 */
@Component
public class MySmartFactoryBean implements SmartFactoryBean<Student> {
	@Override
	public Student getObject() throws Exception {
		System.out.println("我是李四， 我继承了SmartFactoryBean方法， 我实现了eagerInit方法，期望更早期实例化");
		return new Student("李四", 30, 1);
	}

	@Override
	public Class<?> getObjectType() {
		return Student.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	@Override
	public boolean isPrototype() {
		return false;
	}

	@Override
	public boolean isEagerInit() {
		return true;
	}
}
