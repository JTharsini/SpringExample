package com.jeya.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;

@Controller
public class Circle8 implements Shape {
	private Point center;
	
	@Autowired
	private MessageSource messageSource;

	public Circle8() {

	}

	@Override
	public void draw() {
		if(center != null)
		{
			System.out.println("Center is : (" + center.getX() + "," + center.getY() + ")");
		}
		System.out.println(messageSource.getMessage("greeting", null, "Default Message if it doesn't exist", null));
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
}