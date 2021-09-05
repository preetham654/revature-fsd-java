package com.revature.app.inheritance;

public class Child extends Parent {

	//constructor
	public Child(int age) {
		super(age);
		
	}
	
	public void childInstanceMethod() {
		System.out.println("childInstanceMethod()");
		System.out.println(age);
	}
	//method overridding
	public void instanceMethod() {
		super.instanceMethod();
		System.out.println("child instancemethod()");
	}
	 
	public  static void main(String[] args) {
		Child child = new Child(10);
		child.instanceMethod();
		child.childInstanceMethod();
		
		Parent parent = new Child(20);
		parent.instanceMethod();
		}
	

}
//super keyword in child used to refer the parent class constructor
