package com.yaswanth.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yaswanth.aop.service.FactoryService;
import com.yaswanth.aop.service.ShapeService;

public class AopMain {
	public static void main(String[] args) {
     //ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
     //ShapeService shapeService = (ShapeService) ctx.getBean("shapeservice");
		FactoryService factoryService = new FactoryService();
		ShapeService shapeService = (ShapeService) factoryService.getBean("shapeService");
        shapeService.getCircle();
	}
}
  