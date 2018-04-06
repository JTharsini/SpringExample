package com.jeya.spring;

import javax.annotation.Resource;

public class Circle5 implements Shape {
	private Point center;

	@Override
	public void draw() {
		System.out.println("Center is : (" + center.getX() + "," + center.getY() + ")");
	}

	public Point getCenter() {
		return center;
	}

	@Resource(name="pointB")
	public void setCenter(Point center) {
		this.center = center;
	}
}