package com.psl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyCustomProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("In Pre-init of BeanPostProcessor " + arg1);
		return arg0;
	}

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("In Post-init of BeanPostProcessor " + arg1);
		return arg0;
	}

}
