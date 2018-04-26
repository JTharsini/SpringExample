package com.jeya.aop.service;

import com.jeya.aop.model.Circle10;
import com.jeya.aop.model.Triangle4;

// example implementation
public class FactoryService {
	public Object getBean(String beanType) {
		if (beanType.equals("shapeService")) {
			return new ShapeServiceProxy();
		} else if (beanType.equals("circle")) {
			return new Circle10();
		} else if (beanType.equals("triangle")) {
			return new Triangle4();
		}
		return null;
	}
}