package com.yaswanth.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Before("allCircles()")
    public void loggingAdvice(JoinPoint joinPoint) {
         //System.out.println(joinPoint.getTarget());
    }
	
	@AfterReturning(pointcut="args(name)",returning = "returnString")
	public void stringArgumentMethods(String name, Object returnString) {
		System.out.println("A method having arguments as string has called."+ name +" output is"+ returnString);
	}
	@AfterThrowing(pointcut="args(name)",throwing = "ex")
	public void exceptionadvice(String name,Exception ex) {
		System.out.println("An exception has been thrown." +ex);
	}
	
	@Around("allGetters()")
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		
		Object returnValue = null;
		try {
			System.out.println("Before advice");
			returnValue=proceedingJoinPoint.proceed();
			System.out.println("After Returning");
		} catch (Throwable e) {
			System.out.println("After Throwing");
		}
		System.out.println("After Finally");
		return returnValue;
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	
	
	@Pointcut("within(com.yaswanth.aop.model.Circle)")
	public void allCircles() {}
	
}
