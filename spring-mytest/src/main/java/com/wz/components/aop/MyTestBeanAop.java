package com.wz.components.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
/**
 * @author WangZhen
 * @Date 2024/5/26 18:51
 */
@Component
@Aspect
public class MyTestBeanAop {

	/**
	 * 这个方法必须无返回值
	 * joinpoint: 指示所有方法
	 * pointcut: 指示想加入切点的方法
	 *
	 * execution(* com.wz.services.MyTestBean.getName(..))
	 * 	: 匹配com.wz.services.MyTestBean类下的getName方法，参数为多个
	 */
	@Pointcut("execution(* com.wz.services.MyTestBean.getName(..))")
	public void pointCut(){};

	/**
	 * ProceedingJoinPoint只有@Around环绕方法里面有，该类是JoinPoint的子类
	 * @param proceedingJoinPoint
	 */
	@Around("pointCut()")
	public Object around(ProceedingJoinPoint proceedingJoinPoint){
		Signature signature = proceedingJoinPoint.getSignature();
		Object proceed = null;
		try {
			System.out.println("方法执行前");
			proceed = proceedingJoinPoint.proceed();
			System.out.println("方法执行后");
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
		return proceed;
	}

}
