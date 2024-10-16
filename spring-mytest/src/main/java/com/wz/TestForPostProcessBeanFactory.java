package com.wz;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author WangZhen
 * @Date 2024/3/11 21:37
 */
public class TestForPostProcessBeanFactory {
	public static void main(String[] args) {
		// new一个AnnotationConfigApplicationContext的子类，实现其postProcessBeanFactory方法做演示
		// 演示结果可知，在postProcessBeanFactory方法中，可以获取beanFactory的信息，也可以修改其中的BeanDefinition, 是一个很强大的扩展接口
		ApplicationContext context2 = new AnnotationConfigApplicationContext("com.wz"){
			@Override
			protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
				System.out.println("------------------------------------------");
				System.out.println("------------------------------------------");
				System.out.println("------------------------------------------");
				String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
				System.out.println("BeanFactory初始时，加载了以下BeanFactory");
				for (String beanDefinitionName : beanDefinitionNames) {
					// 这里不能调用getBean方法，调用了，就会触发bean的实例化操作，为了演示，先不调用
//					Object bean = beanFactory.getBean(beanDefinitionName);
//					System.out.println(beanDefinitionName + "===>" + bean.getClass().getName());
					System.out.println(beanDefinitionName);
				}

				// 获得名字叫person的bean， 并修改其属性
				beanFactory.getBeanDefinition("person").setPrimary(true);
				System.out.println("------------------------------------------");
				System.out.println("------------------------------------------");
				System.out.println("------------------------------------------");
			}
		};
	}
}
