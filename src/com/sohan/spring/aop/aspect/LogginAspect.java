package com.sohan.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogginAspect {

	@Before("allGetters() && allCircleMethod()")
	public void loggingAdvice() {
		System.out.println("Advice method is called.");
	}

	@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("Second advice method is called.");
	}

	@Before("allMethodWithArgs()")
	public void thirdAdvice() {
		System.out.println("Third advice method is called.");
	}

	@Pointcut("execution(public * get*(..))")
	public void allGetters() {
	}

	@Pointcut("within(com.sohan.spring.aop.model.Circle)")
	public void allCircleMethod() {
	}

	@Pointcut("args(java.lang.String, ..)")
	public void allMethodWithArgs() {
	}

}
