package com.jeya.spring;

public class Triangle7 {
	private String type;

	private int height;

	public Triangle7(String type, int height) {
		this.type = type;
		this.height = height;
	}

	public Triangle7(String type) {
		this.type = type;
	}

	public Triangle7(int height) {
		this.height = height;
	}

	public void draw() {
		System.out.println(getType() + " triangle7 with height of " + getHeight() + " drawn");
	}

	public String getType() {
		return type;
	}

	public int getHeight() {
		return height;
	}
}