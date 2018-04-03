package com.jeya.spring;

public class Triangle2 {
	private String type;

	public Triangle2(String type) {
		this.type = type;
	}

	public void draw() {
		System.out.println(getType() + " triangle2 drawn");
	}

	public String getType() {
		return type;
	}
}