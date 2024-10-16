package com.wz.components.application_listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

/**
 * @author WangZhen
 * @Date 2024/5/26 18:43
 */
@Component
public class ContextStartedEventTest implements ApplicationListener<ContextStartedEvent> {
	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("监听：spring容器开始启动事件");
	}
}
