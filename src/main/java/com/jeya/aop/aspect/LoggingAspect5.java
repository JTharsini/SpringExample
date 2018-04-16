package com.jeya.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect5 {
	@Before("allCircleMethods() && allMethodsWhichTakeParticularArguments()")// able to combine point cuts
	public void loggingAdvice() {
		System.out.println("Advice5 second advice run.. Circle5's method called");
	}
	
	//@Pointcut("execution(* com.jeya.aop.model.Circle5.*(..))")
	// or
	@Pointcut("within(com.jeya.aop.model.Circle5)") // readable
	//"within(com.jeya.aop.model.Circle5)"
	//"within(com.jeya.aop.model.*)" // to all classes in that package
	//"within(com.jeya.aop.model..*)" // to all the sub packages, classes, classes in the sub packages
	public void allCircleMethods()
	{
		
	}
	
	@Pointcut("args()")
	//"args(class name or interface name)" : example: in proxy
	public void allMethodsWhichTakeParticularArguments()
	{
		
	}
}