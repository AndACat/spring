package com.wz.components.application_listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

/**
 * @author WangZhen
 * @Date 2024/5/26 18:41
 */
@Component
public class ContextCloseEventTest implements ApplicationListener<ContextClosedEvent> {
	@Override
	public void onApplicationEvent(ContextClosedEvent event) {
		System.out.println("监听：spring容器被关闭了");
	}
}
