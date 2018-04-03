package com.jeya.spring;

public class Triangle4 {
	private String type;

	private int height;

	public Triangle4(String type) {
		this.type = type;
	}

	public Triangle4(int height) {
		this.height = height;
	}

	public void draw() {
		System.out.println(getType() + " triangle4 with height of " + getHeight() + " drawn");
	}

	public String getType() {
		return type;
	}

	public int getHeight() {
		return height;
	}
}