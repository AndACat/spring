package com.wz;


import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Person {
	private String name = "张三";
	private Integer age = 20;

	@Autowired
	private Son son;
}
