package com.jeya.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class TriangleWithPoints5 implements ApplicationContextAware {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context;
	
	public TriangleWithPoints5()
	{
		
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Point A = (" + getPointA().getX() + ", " + getPointA().getY() + ")");
		System.out.println("Point B = (" + getPointB().getX() + ", " + getPointB().getY() + ")");
		System.out.println("Point C = (" + getPointC().getX() + ", " + getPointC().getY() + ")");

	}
	
	public void initializePoints()
	{
		Point pointA = (Point) context.getBean("pointA");
		setPointA(pointA);
		
		Point pointB = (Point) context.getBean("pointB");
		setPointB(pointB);
		
		Point pointC = (Point) context.getBean("pointC");
		setPointC(pointC);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
	}
}