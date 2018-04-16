package com.jeya.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect4 {
	// "execution(* get*(..))" is a point cut for that aspect method
	// same point cuts by two different methods
	
	@Before("allGetters()")// zero or more arguments
	public void loggingAdvice() {// advice is convention
		System.out.println("Advice41 run.. Get method called");
	}
	
	@Before("allGetters()")
	public void loggingSecondAdvice() {
		System.out.println("Advice42 second advice run.. Get method called");
	}
	
	@Pointcut("execution(* get*(..))")
	public void allGetters()// dummy method to hold this point cut
	{
		
	}
}