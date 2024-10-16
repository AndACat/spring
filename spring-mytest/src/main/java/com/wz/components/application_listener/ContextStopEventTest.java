package com.wz.components.application_listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;

/**
 * @author WangZhen
 * @Date 2024/5/26 18:43
 */
@Component
public class ContextStopEventTest implements ApplicationListener<ContextStoppedEvent> {
	@Override
	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println("监听: spring容器停止了");
	}
}
