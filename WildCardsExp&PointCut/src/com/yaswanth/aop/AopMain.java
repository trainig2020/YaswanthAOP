package com.yaswanth.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yaswanth.aop.service.ShapeService;

public class AopMain {
	public static void main(String[] args) {
     ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
     ShapeService shapeService = (ShapeService) ctx.getBean("shapeservice");
     System.out.println(shapeService.getCircle().getName());
	}
}
