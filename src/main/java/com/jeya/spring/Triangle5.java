package com.jeya.spring;

public class Triangle5 {
	private String type;

	private int height;

	public Triangle5(String type, int height) {
		this.type = type;
		this.height = height;
	}

	public Triangle5(String type) {
		this.type = type;
	}

	public Triangle5(int height) {
		this.height = height;
	}

	public void draw() {
		System.out.println(getType() + " triangle5 with height of " + getHeight() + " drawn");
	}

	public String getType() {
		return type;
	}

	public int getHeight() {
		return height;
	}
}