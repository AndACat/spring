package com.wz.factorybeantest;

import com.wz.pojo.Student;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * 这个工厂bean会优先创建本身， 不会通过getObject方法创建内部bean
 * 除非实现SmartFactoryBean接口
 */
@Component("myFactoryBean")
public class MyFactoryBean implements FactoryBean<Student> {
	@Override
	public Student getObject() throws Exception {
		System.out.println("我是张三， 我继承了FactoryBean方法");
		return new Student("张三", 36, 1);
	}

	@Override
	public Class<?> getObjectType() {
		return Student.class;
	}

}
