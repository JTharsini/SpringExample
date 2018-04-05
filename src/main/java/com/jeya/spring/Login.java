package com.jeya.spring;

public class Login {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println("Login: " + name);
	}
}