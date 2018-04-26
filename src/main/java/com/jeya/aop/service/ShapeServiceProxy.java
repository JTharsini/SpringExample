package com.jeya.aop.service;

import com.jeya.aop.aspect.DummyAspectForDemo;
import com.jeya.aop.model.Circle10;

public class ShapeServiceProxy extends ShapeService10 {
	public Circle10 getCircle10() {
		new DummyAspectForDemo().loggingAdvice();
		return super.getCircle10();
	}
}