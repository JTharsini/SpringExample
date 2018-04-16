package com.jeya.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect2 {
	
	@Before("execution(public String com.jeya.aop.model.Circle2.getName())")
	public void loggingAdvice() {// advice is convention
		System.out.println("Advice2 run.. Get method called");
	}
}