package com.jeya.spring.springspecific;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// before bean factory it self gets initialized
		System.out.println("My bean factory post processor is invoked");
		// bean factory initialized
		// first singleton instance is created
	}
}