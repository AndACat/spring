package com.wz.factorybeantest;

import com.wz.pojo.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationStart {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.wz.factorybeantest");
		Object myFactoryBean = context.getBean("myFactoryBean");
		System.out.println(myFactoryBean.toString());
	}
}
