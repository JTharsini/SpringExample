package com.jeya.spring;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;

@Controller
public class Circle8 implements Shape {
	private Point center;
	
	@Autowired
	private MessageSource messageSource;

	public Circle8() {
		center = new Point(24, 34); // just for testing message source
	}

	@Override
	public void draw() {
		System.out.println(messageSource.getMessage("drawing.circle", null, "Default circle message", null));
		if(center != null)
		{
			System.out.println(messageSource.getMessage("drawing.point", new Object[]{center.getX(), center.getY()}, "Default center message", Locale.JAPANESE));
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