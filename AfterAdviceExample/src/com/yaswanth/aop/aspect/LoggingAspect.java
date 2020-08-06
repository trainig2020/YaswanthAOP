package com.yaswanth.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
//	@Before("allCircles()")
//    public void loggingAdvice(JoinPoint joinPoint) {
//         //System.out.println(joinPoint.getTarget());
//    }
//	
//	@AfterReturning("args(name)")
//	public void stringArgumentMethods(String name) {
//		System.out.println("A method having arguments as string has called."+ name);
//	}
//	@AfterThrowing("args(name)")
//	public void exceptionadvice(String name) {
//		System.out.println("An exception has been thrown." );
//	}
//	
//	@Pointcut("within(com.yaswanth.aop.model.Circle)")
//	public void allCircles() {}
	
	
	
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
	
	@Pointcut("within(com.yaswanth.aop.model.Circle)")
	public void allCircles() {}
	
}
