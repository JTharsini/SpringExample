package com.jeya.aop.model;

public class Circle10 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Setter is invoked");
	}
}