package com.wz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
import org.springframework.stereotype.Component;

@Component
public class MyTestBean {

	@Autowired
	private EnvironmentAware environmentAware;

	@Autowired
	private Person person;


	public void test(){
		System.out.println("--------------------------------------------------------------");
		System.out.println("person = " + person);
		System.out.println("environmentAware = " + environmentAware);
		System.out.println("first bean test");
	}
}
