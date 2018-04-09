package com.jeya.spring.springspecific;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener implements ApplicationListener<ApplicationEvent> {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("************************************************************");
		if(event instanceof DrawEvent)
		{
			System.out.println("When the circle is drawing this has been triggered");
			System.out.println(event.toString());
		}
		else
		{
			System.out.println("When application event by spring occurs");
			System.out.println(event.toString());
		}
		System.out.println("************************************************************");
	}
}