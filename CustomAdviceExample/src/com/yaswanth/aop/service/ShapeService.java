package com.yaswanth.aop.service;

import com.yaswanth.aop.aspect.Loggable;
import com.yaswanth.aop.model.Circle;
import com.yaswanth.aop.model.Traingle;

public class ShapeService {
    private Circle circle;
    private Traingle traingle;
    @Loggable
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Traingle getTraingle() {
		return traingle;
	}
	public void setTraingle(Traingle traingle) {
		this.traingle = traingle;
	}
    
    
}
