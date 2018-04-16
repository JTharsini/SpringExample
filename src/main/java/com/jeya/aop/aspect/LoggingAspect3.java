package com.jeya.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect3 {
	
	@Before("execution(* get*(..))")// zero or more arguments
	public void loggingAdvice() {// advice is convention
		System.out.println("Advice3 run.. Get method called");
	}
}