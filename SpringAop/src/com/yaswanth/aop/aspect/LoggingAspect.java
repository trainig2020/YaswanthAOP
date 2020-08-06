package com.yaswanth.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	//in order to restrict to particular methods we have to write like this.
	@Before("execution(public String com.yaswanth.aop.model.Circle.getName())")
	
	//@Before("execution(public String getName())")
    public void loggingAdvice() {
    	System.out.println("Advice run. get Method Called");
    }
}
