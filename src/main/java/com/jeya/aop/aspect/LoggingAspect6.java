package com.jeya.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.jeya.aop.model.Circle6;

@Aspect
public class LoggingAspect6 {
	@Before("allCircleMethods()")
	public void loggingAdvice(JoinPoint joinPoint) {
		/**
		 * JoinPoint means all the places in code where aspect can be applied
		 * Spring AOP : only in methods
		 * AspectJ : not only in methods, changes in attribute of a class
		 */
		System.out.println("Advice6 second advice run.. Circle6's " + joinPoint.getSignature().getName() + "() method will be called");
		Circle6 circle6 = (Circle6)joinPoint.getTarget();// will return that object
		System.out.println(circle6.getName());
	}
	
	@Pointcut("within(com.jeya.aop.model.Circle6)")
	public void allCircleMethods()
	{
		
	}
	
	@Before("args(omg)") // any name is allowed, but need to use same name in argument as well
	public void stringArgumentMethods(String omg)
	{
		System.out.println("A method which takes String argument " + omg + " will be called");
	}
}