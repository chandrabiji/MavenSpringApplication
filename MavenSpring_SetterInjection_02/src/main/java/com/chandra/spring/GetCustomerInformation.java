package com.chandra.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetCustomerInformation {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Customer customer = (Customer) context.getBean("c");
		customer.customerDetails();

	}

}
