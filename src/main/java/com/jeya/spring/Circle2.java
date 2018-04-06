package com.jeya.spring;

import org.springframework.beans.factory.annotation.Required;

public class Circle2 implements Shape {
	private Point center;

	@Override
	public void draw() {
		System.out.println("Center is : (" + center.getX() + "," + center.getY() + ")");
	}

	public Point getCenter() {
		return center;
	}
	
	@Required
	public void setCenter(Point center) {
		this.center = center;
	}
}