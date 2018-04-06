package com.jeya.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Circle6 implements Shape {
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
	
	@PostConstruct
	public void initCircle6Bean()
	{
		System.out.println("Init of circle6");
	}
	
	@PreDestroy
	public void destroyCircle6Bean()
	{
		System.out.println("Destroy of circle6");
	}
}