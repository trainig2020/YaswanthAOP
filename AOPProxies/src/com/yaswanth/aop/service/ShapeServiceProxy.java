package com.yaswanth.aop.service;

import com.yaswanth.aop.aspect.LoggingAspect;
import com.yaswanth.aop.model.Circle;

public class ShapeServiceProxy extends ShapeService {
	public Circle getCircle() {
		new LoggingAspect().loggingAdvice();
		return super.getCircle();
	}
}
