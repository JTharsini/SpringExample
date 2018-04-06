package com.jeya.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Circle3 implements Shape {
	private Point center;

	@Override
	public void draw() {
		System.out.println("Center is : (" + center.getX() + "," + center.getY() + ")");
	}

	public Point getCenter() {
		return center;
	}
	
	@Autowired
	public void setCenter(Point center) {
		this.center = center;
	}
}