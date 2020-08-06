package com.yaswanth.aop.service;

import com.yaswanth.aop.model.Circle;
import com.yaswanth.aop.model.Traingle;

public class FactoryService {
    public Object getBean(String beanType) {
    	if(beanType.equals("shapeService"))return new ShapeServiceProxy();
    	if(beanType.equals("circle"))return new Circle();
    	if(beanType.equals("traingle"))return new Traingle();
    	return null;
    }
}
