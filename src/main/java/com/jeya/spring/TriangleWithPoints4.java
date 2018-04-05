package com.jeya.spring;

public class TriangleWithPoints4 {
	private Point pointA;
	private Point pointB;
	private Point pointC;

	public TriangleWithPoints4(Point pointA, Point pointB, Point pointC) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Point A = (" + pointA.getX() + ", " + pointA.getY() + ")");
		System.out.println("Point B = (" + pointB.getX() + ", " + pointB.getY() + ")");
		System.out.println("Point C = (" + pointC.getX() + ", " + pointC.getY() + ")");

	}
}