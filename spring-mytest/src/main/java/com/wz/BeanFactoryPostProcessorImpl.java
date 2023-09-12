package com.wz;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * 像这种类第一次被使用的时候, 直接用BeanUtils.newInstance()去帮我们new出对象
 * 需要考虑是否实现了BeanFactoryPostProcessor无法使用动态代理
 */
@Component
public class BeanFactoryPostProcessorImpl implements BeanFactoryPostProcessor {

	public BeanFactoryPostProcessorImpl() {
		System.out.println("postProcessBeanFactory的构造器被执行了, 说明我被实例化了");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("进来了: postProcessBeanFactory");
		System.out.println("beanFactory = " + beanFactory);
		beanFactory.ignoreDependencyInterface(Person.class);
	}
}
