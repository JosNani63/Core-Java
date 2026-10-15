package com.methods;

//No return type + no parameters
public class test_methods2 {
	public static void welcome() {
		System.out.println("welcome to java world");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		test_methods2.welcome();
		test_methods2 t1 = new test_methods2();
		t1.hello();
		System.out.println("main method ended");
	}

	public void hello() {
		System.out.println("hello good morning");
	
	}
}