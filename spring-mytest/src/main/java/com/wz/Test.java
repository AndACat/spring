package com.wz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
//		ConfigurableApplicationContext context1 = new ClassPathXmlApplicationContext("classpath:application.xml");

		ApplicationContext context2 = new AnnotationConfigApplicationContext("com.wz");

		MyTestBean bean = (MyTestBean) context2.getBean("myTestBean");
		bean.test();

	}
}

