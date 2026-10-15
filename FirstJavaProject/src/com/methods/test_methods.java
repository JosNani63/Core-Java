package com.methods;

//No return type + no parameters
public class test_methods {
	public static void welcome() {
		System.out.println("welcome to java world");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		test_methods.welcome();
		test_methods t1 = new test_methods();
		t1.hello();
		System.out.println("main method ended");
	}

	public void hello() {
		System.out.println("hello good morning");
	
	}
}