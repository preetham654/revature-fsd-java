package com.revature.app.inheritance;

public class Parent {
	
	//when age is private in parent class and used in another class it is not accessed
	//when age is protected in parent class and used in child class it can be accessed
	
	//instance variable
	protected int age;
	
	//constructor

	public Parent(int age) {
		System.out.println("parent constructor");
		System.out.println();
		this.age = age;
	}
	//instance method
	public void instanceMethod() {
		System.out.println("Parent instance method()");
		

	}


		
	}
