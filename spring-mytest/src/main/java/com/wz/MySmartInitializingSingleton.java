package com.wz;

import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.stereotype.Component;

@Component
public class MySmartInitializingSingleton implements SmartInitializingSingleton {
	@Override
	public void afterSingletonsInstantiated() {
		System.out.println("被回调函数调用， 表明所有的bean都已被实例化完成~~");
	}
}
