package com.chandra.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean,DisposableBean{
	
	private String type;
	
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void destroy() throws Exception {
		System.out.println("DisposableBean  destroy method called for triangle");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init method called for triangle");
	
	}
	
	public void myInit()
	{
		System.out.println("My init method called for triangle");
	}
	public void cleanup()
	{
		System.out.println("Cleanup method called for triangle");
	}

	public void draw()
	{
		System.out.println("Triangle Type : "+getType());
	}
}
