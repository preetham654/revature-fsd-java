package com.revature.learnstatic;

public class StaticDemoAnotherClass {
	
	public static void main(String[] args) {
		System.out.println(StaticDemo.age);
		StaticDemo.age = 25;
		System.out.println(StaticDemo.age);
		
		StaticDemo demo = new StaticDemo();
		System.out.println(StaticDemo.age);
		StaticDemo.age=40; 
		System.out.println(StaticDemo.age);
		System.out.println(StaticDemo.age);
		
		
		
	
	}

}
