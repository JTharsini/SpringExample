package com.jeya.spring;

public class Triangle8 {
	private String type;

	private int height;

	public Triangle8(String type, int height) {
		this.type = type;
		this.height = height;
	}

	public Triangle8(String type) {
		this.type = type;
	}

	public Triangle8(int height) {
		this.height = height;
	}

	public void draw() {
		System.out.println(getType() + " triangle8 with height of " + getHeight() + " drawn");
	}

	public String getType() {
		return type;
	}

	public int getHeight() {
		return height;
	}
}