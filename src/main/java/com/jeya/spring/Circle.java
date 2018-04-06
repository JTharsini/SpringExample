package com.jeya.spring;

public class Circle implements Shape {
	private Point center;

	@Override
	public void draw() {
		System.out.println("Center is : (" + center.getX() + "," + center.getY() + ")");
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}
}