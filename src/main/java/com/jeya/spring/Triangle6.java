package com.jeya.spring;

public class Triangle6 {
	private String type;

	private int height;

	public Triangle6(String type, int height) {
		this.type = type;
		this.height = height;
	}

	public Triangle6(String type) {
		this.type = type;
	}

	public Triangle6(int height) {
		this.height = height;
	}

	public void draw() {
		System.out.println(getType() + " triangle6 with height of " + getHeight() + " drawn");
	}

	public String getType() {
		return type;
	}

	public int getHeight() {
		return height;
	}
}