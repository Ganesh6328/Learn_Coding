package com.ganesh;

public class MethodDemo {
	
	public static void method()
	{
		System.out.println("Method started!!!!");
		System.out.println("Method ended!!!!");
	}
	
	public void method1()
	{
		System.out.println("Method1 started!!!");
		System.out.println("Method1 ended!!!");
	}

	public static void main(String[] args) {
		System.out.println("Main method started!!!!");
		method();
		MethodDemo obj = new MethodDemo();
		obj.method1();
		System.out.println("Main method ended!!!!");

	}

}

