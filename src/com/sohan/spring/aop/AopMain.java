package com.sohan.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sohan.spring.aop.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
		shapeService.getCircle().setName("New Circle Name");
		System.out.println(shapeService.getCircle().getName());
		// System.out.println(shapeService.getTriangle().getName());
	}

}
