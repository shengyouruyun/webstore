package com.packet.webstore.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.HandlerInterceptor;

public class ProcessingTimeLogInterceptor implements HandlerInterceptor{
	private static final Logger LOGGER = Logger.getLogger(ProcessingTimeLogInterceptor.class);
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){
		long startTime = System.currentTimeMillis();
		request.setAttribute("startTime", startTime);
		return true;
	}

	public void postHandle(HttpServletRequest request, 
		HttpServletResponse response, Object handler, ModelAndView modelandView) 
	{
		String queryString = request.getQueryString() == null ? "":"?" + request.getQueryString();
		String path = request.getRequestURL() + queryString;
		long startTime = (long) request.getAttribute("startTime");
		long endTime = System.currentTimeMillis();
		LOGGER.info(String.format("%s millisecond taken to process the request %s.",(endTime-startTime), path));
	}
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, 
		Object handler, Exception exceptionIfAny){
		//no operation
	}
}