package com.jeya.spring;

import org.springframework.stereotype.Component;

@Component
public class Circle7 implements Shape {
	private Point center;
	
	public Circle7()
	{
		System.out.println("Initialized circle 7 without telling that in xml");
	}

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