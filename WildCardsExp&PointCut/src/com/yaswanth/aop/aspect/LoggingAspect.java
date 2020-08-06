package com.yaswanth.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	//wildcards that yu want apply we have to give * . it will be exceuted for every get methods.
	
//	@Before("execution(* get*())")
//    public void loggingAdvice() {
//    	System.out.println("Advice run. get Method Called");
//    }
//	
//	@Before("execution(* get*())")
//	public void secondAdvice() {
//		System.out.println("Second advice executed");
//	}
//	
	
	//Here * get*() is point cut method. so we can define same point cut for different methods as like below.
	
//	@Before("allGetters()")
//    public void loggingAdvice() {
//    	System.out.println("Advice run. get Method Called");
//    }
//	
//	@Before("allGetters()")
//	public void secondAdvice() {
//		System.out.println("Second advice executed");
//	}
//	
//
//	@Pointcut("execution(* get*())")
//	public void allGetters() {}
//	
//	we can write @pointcut for particular methods which are present particular class like below using within()
//	@Pointcut("within(com.yaswanth.aop.model.Circle)")
//	public void allCircles() {}
	
	
	
	// we can combine two pointcuts like below.
	@Before("allGetters() && allCircles()")
    public void loggingAdvice() {
    	System.out.println("Advice run. get Method Called");
    }
	
	@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("Second advice executed");
	}
	

	@Pointcut("execution(* get*())")
	public void allGetters() {}
	
	
	@Pointcut("within(com.yaswanth.aop.model.Circle)")
	public void allCircles() {}
	
}
