package com.jeya.spring.springspecific;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException { // object is passed and name of the object is passed
		//System.out.println("After initializing of " + beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		//System.out.println("Before initializing of " + beanName);
		return bean;
	}
}