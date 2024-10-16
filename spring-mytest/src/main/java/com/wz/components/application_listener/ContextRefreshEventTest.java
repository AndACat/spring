package com.wz.components.application_listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * 测试时间监听器所用， 实现ApplicationListener接口， 可监听上下文的各种事件
 * 这里实际监听的是上下文refresh成功的最终事件
 */
@Component
public class ContextRefreshEventTest implements ApplicationListener<ContextRefreshedEvent> {
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		synchronized (this){
			System.out.println("----------------------------------------------------");
			System.out.println("event = " + event);
			System.out.println("event被通知到了");
			System.out.println("监听上下文状态: 已刷新完成");
			System.out.println("----------------------------------------------------");
		}
	}
}
