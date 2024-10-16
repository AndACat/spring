package com.wz;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author WangZhen
 * @Date 2024/3/11 21:56
 */
public class TestForInvokeBeanFactoryPostProcessors {
	public static void main(String[] args) {
		// new一个AnnotationConfigApplicationContext的子类，实现其postProcessBeanFactory方法做演示
		// 演示结果可知，在postProcessBeanFactory方法中，可以获取beanFactory的信息，也可以修改其中的BeanDefinition, 是一个很强大的扩展接口
		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext("com.wz");
		context2.addBeanFactoryPostProcessor((beanFactory -> {
			System.out.println("---------------6666----------------");
			Arrays.stream(beanFactory.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println("----------------666---------------");
		}));
	}
}
