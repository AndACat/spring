package com.wz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		MyTestBean bean = (MyTestBean) ac.getBean("myTestBean");
		bean.test();
	}
}

