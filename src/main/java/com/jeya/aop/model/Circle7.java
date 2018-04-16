package com.jeya.aop.model;

public class Circle7 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Setter is invoked");
	}
	
	public void setNameAndThrow(String name) {
		this.name = name;
		System.out.println("setNameAndThrow is invoked");
		throw(new RuntimeException()); // to test @After and @AfterReturning and @AfterThrowing
	}
	
	public String setNameAndReturn(String name) {
		this.name = name;
		System.out.println("setNameAndReturn is invoked");
		return name + "jrrr";
		//throw(new RuntimeException()); // to test @After and @AfterReturning
	}
}