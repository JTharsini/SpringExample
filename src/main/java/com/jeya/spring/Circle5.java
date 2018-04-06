package com.jeya.spring;

import javax.annotation.Resource;

public class Circle5 implements Shape {
	private Point center;
	private Radius radius;

	@Override
	public void draw() {
		System.out.println("Center is : (" + center.getX() + "," + center.getY() + ")");
		System.out.println("Radius is : " + radius.getValue());
	}

	public Point getCenter() {
		return center;
	}

	@Resource(name="pointB")
	public void setCenter(Point center) {
		this.center = center;
	}

	public Radius getRadius() {
		return radius;
	}

	@Resource
	public void setRadius(Radius radius) {
		this.radius = radius;
	}
}