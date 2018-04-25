package com.jeya.aop.model;

import com.jeya.aop.aspect.LoggingAnnotation;

public class Circle8 {
	private String name;

	public String getName() {
		return name;
	}

	@LoggingAnnotation
	public void setName(String name) {
		this.name = name;
		System.out.println("Setter is invoked");
	}
}