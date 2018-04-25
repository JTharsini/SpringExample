package com.jeya.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect8 {
	@Around("@annotation(com.jeya.aop.aspect.LoggingAnnotation)") 
	// method annotated with LoggingAnnotation will have this method executed around
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		Object returnValue = null;
		System.out.println("@Around before proceed");
		try {
			returnValue = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			System.out.println("Error");
		}
		System.out.println("@Around after proceed");
		return returnValue;
	}
}