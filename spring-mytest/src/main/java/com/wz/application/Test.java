package com.wz.application;

import com.wz.services.MyTestBean;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
//		ConfigurableApplicationContext context1 = new ClassPathXmlApplicationContext("classpath:application.xml");

		ApplicationContext context2 = new AnnotationConfigApplicationContext("com.wz"){
			@Override
			protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
				super.postProcessBeanFactory(beanFactory);
				for (String beanDefinitionName : beanFactory.getBeanDefinitionNames()) {
					System.out.println("beanDefinitionName= " + beanDefinitionName);
				}
			}
		};

		MyTestBean bean = (MyTestBean) context2.getBean("myTestBean");
		bean.test();
		System.out.println(bean.getName());

//		Test test = BeanUtils.instantiateClass(Test.class);


	}
}

