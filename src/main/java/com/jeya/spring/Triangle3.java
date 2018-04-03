package com.jeya.spring;

public class Triangle3 {
	private String type;

	private int height;

	public Triangle3(String type, int height) {
		this.type = type;
		this.height = height;
	}

	public Triangle3(String type) {
		this.type = type;
	}

	public void draw() {
		System.out.println(getType() + " triangle3 with height of " + getHeight() + " drawn");
	}

	public String getType() {
		return type;
	}

	public int getHeight() {
		return height;
	}
}