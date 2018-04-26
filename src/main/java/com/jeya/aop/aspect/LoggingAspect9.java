package com.jeya.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect9 {
	// Pointcut can be placed here as well in case of XML configuration
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