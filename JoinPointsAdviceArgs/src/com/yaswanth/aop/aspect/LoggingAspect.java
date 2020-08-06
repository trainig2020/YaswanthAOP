package com.yaswanth.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	@Before("allCircles()")
    public void loggingAdvice(JoinPoint joinPoint) {
         System.out.println(joinPoint.getTarget());
    }
	
	@Before("args(name)")
	public void stringArgumentMethods(String name) {
		System.out.println("A method having arguments as string has called."+ name);
	}
//	@Before("args(String)")
//	public void stringArgumentMethods() {
//		System.out.println("A method having arguments as string has called." );
//	}
	
	@Pointcut("within(com.yaswanth.aop.model.Circle)")
	public void allCircles() {}
	
}
