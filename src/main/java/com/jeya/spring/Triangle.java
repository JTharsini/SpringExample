package com.jeya.spring;

public class Triangle {
	private String type;

	private int height;

	public void draw() {
		System.out.println(getType() + " triangle drawn");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHeight() {
		return height;
	}
}