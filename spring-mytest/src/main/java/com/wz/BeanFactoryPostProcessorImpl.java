package com.wz;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class BeanFactoryPostProcessorImpl implements BeanFactoryPostProcessor {

	public BeanFactoryPostProcessorImpl() {
		System.out.println("构造器");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("beanFactory = " + beanFactory);
		beanFactory.ignoreDependencyInterface(Person.class);
	}
}
