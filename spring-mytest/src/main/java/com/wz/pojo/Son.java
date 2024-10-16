package com.wz.pojo;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Son {
	private String name = "儿子";

	@Autowired
	private Person person;
}
