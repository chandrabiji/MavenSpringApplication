package com.chandra.spring;

public class Customer {

	public String name;
	public int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void customerDetails()
	{
		System.out.println("Customer Name : "+getName());
		System.out.println("Customer Age  : "+getAge());
	}
}
