package com.jeya.spring;

public class TriangleWithPoints7{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public TriangleWithPoints7()
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
		if(getPointA() != null)
		{
			System.out.println("Point A = (" + getPointA().getX() + ", " + getPointA().getY() + ")");
		}
		if(getPointB() != null)
		{
			System.out.println("Point B = (" + getPointB().getX() + ", " + getPointB().getY() + ")");
		}
		if(getPointC() != null)
		{
			System.out.println("Point C = (" + getPointC().getX() + ", " + getPointC().getY() + ")");
		}
	}
}