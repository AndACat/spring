package com.wz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext("com.wz");

		MyTestBean bean = (MyTestBean) ac.getBean("myTestBean");
		bean.test();

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

	}
}

