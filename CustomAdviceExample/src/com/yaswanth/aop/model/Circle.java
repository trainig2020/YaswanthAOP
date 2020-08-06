package com.yaswanth.aop.model;

import com.yaswanth.aop.aspect.Loggable;

public class Circle {
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("circle setter called");
		throw(new RuntimeException());
	}
	public String setNameAndReturn(String name) {
		this.name = name;
		System.out.println("circle setter called");
		return name;
	}
}
