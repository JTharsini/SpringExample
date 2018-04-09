package com.jeya.spring;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Controller;

import com.jeya.spring.springspecific.DrawEvent;

@Controller
public class Circle9 implements Shape, ApplicationEventPublisherAware {
	private Point center;
	private ApplicationEventPublisher publisher;

	public Circle9() {
	}

	@Override
	public void draw() {
		System.out.println("Drawing circle");
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;
	}
}