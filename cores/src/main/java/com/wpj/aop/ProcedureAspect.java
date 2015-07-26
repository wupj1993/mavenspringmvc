/*
 * Copyright (c) 2015 - 7 - 8
 * ---7 :56:55
 * ---作者:吴培基
 * ---QQ:757671834
 */

package com.wpj.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

@Component
@Aspect
public class ProcedureAspect {
private Logger logger= Logger.getLogger(ProcedureAspect.class);

	@Pointcut("execution(* com.wpj.aop.*.*(..)) ")
	public void targetMethods() {}
	
	@Before("@annotation(com.wpj.aop.Procedure)")
	public void preHandle(JoinPoint joinPoint) {
		logger.info("info:----------------------------------------------------------->before");
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		//读取session中的用户
	//	logger.info("name---------->"+ SecurityTools.getUserName());
		//请求的IP
		String ip = request.getRemoteAddr();
		logger.info("ip----------->"+ip);
		logger.info("请求方法:" + (joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()"));
		try {
			logger.info("方法描述:" + getControllerMethodDescription(joinPoint));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterReturning(
			pointcut="@annotation(spring.security.maven.aop.Procedure)",
			returning="retVal")
	public void postHandle(Object retVal) {
		logger.info("Aspect :: postHandle, retVal={}");
	}

	@Around("@annotation(spring.security.maven.aop.Procedure)")
	public Object handle(ProceedingJoinPoint pjp) {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes()).getRequest();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
		Calendar ca = Calendar.getInstance();
		String operDate = df.format(ca.getTime());
		logger.info(operDate+"------------");
		logger.info("Aspect :: around - start");
		Object[] args;
		try {
			args = pjp.getArgs();
			return args == null ? pjp.proceed() : pjp.proceed(args);
		} catch (Throwable e) {
			logger.info("Aspect :: handleException");
			int statusCode = 500;
			String statusMessage = "unknown";
			if (e instanceof ProcedureException) {
				statusCode = ((ProcedureException) e).getStatusCode();
				statusMessage = ((ProcedureException) e).getStatusMessage();
			} else if (e instanceof IllegalArgumentException) {
				statusCode = 400;
				statusMessage = "Invalid parameter";
			}
			Output<Object> error = new Output<Object>(UUID.randomUUID().toString(), statusCode, statusMessage);
			return error;
		} finally {
			logger.info("Aspect :: around - end");
		}
	}
	/**
	 * 获取注解中对方法的描述信息 用于Controller层注解
	 * @param joinPoint 切点
	 * @return 方法描述
	 * @throws Exception
	 */
	public  static String getControllerMethodDescription(JoinPoint joinPoint)  throws Exception {
		String targetName = joinPoint.getTarget().getClass().getName();
		String methodName = joinPoint.getSignature().getName();
		Object[] arguments = joinPoint.getArgs();
		Class targetClass = Class.forName(targetName);
		Method[] methods = targetClass.getMethods();
		String description = "";
		for (Method method : methods) {
			if (method.getName().equals(methodName)) {
				Class[] clazzs = method.getParameterTypes();
				if (clazzs.length == arguments.length) {
					description = method.getAnnotation(Procedure.class).description();
					break;
				}
			}
		}
		return description;
	}

}
