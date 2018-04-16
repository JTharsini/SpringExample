package com.jeya.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect7 {
	@Before("allCircleMethods()")
	public void loggingAdvice() {
		System.out.println("allCircleMethods before");
	}
	
	@After("args(name)") // similar to after finally
	// @After runs no matter method executes successfully or not
	public void loggingAdvice2(String name) {
		System.out.println("after stringAsArgument");
	}
	
	@AfterReturning(pointcut="args(name)",returning="returnString")
	// @AfterReturning runs, only target method executed successfully : exception or error ==> no execution
	public void loggingAdvice3(String name, String returnString) {// or Object returnedType
		System.out.println("stringAsArgument after returning: output : " + returnString);
	}
	
	@AfterThrowing(pointcut="args(name)", throwing="ex") // we can have different type of exception as argument and give different
	// different advice, based on the type of exception
	// @AfterReturning runs, only target method executed successfully : exception or error ==> no execution
	public void loggingAdvice4(String name, RuntimeException ex) {// or Object returnedType
		System.out.println("stringAsArgument after throwing : " + ex);
	}

	@Pointcut("within(com.jeya.aop.model.Circle7)")
	public void allCircleMethods() {

	}
}