package com.methods;

// no return type + with parameters
public class test2methods {
	public static void main(String[] args) {
		System.out.println("main method started");

		addition(100, 200);
		substraction(200, 100);
		multiplication(10, 100);
		division(200, 10);
		modulus(200, 10);

		System.out.println("main method ended");
	}

	static void addition(int a, int b) {
		System.out.println("addition method called");
		System.out.println(a + b);
	}

	static void substraction(int a, int b) {
		System.out.println("substraction method called");
		System.out.println(a - b);
	}

	static void multiplication(int a, int b) {
		System.out.println("multiplication method called");
		System.out.println(a * b);
	}

	static void division(int a, int b) {
		System.out.println("division method called");
		System.out.println(a / b);
	}

	static void modulus(int a, int b) {
		System.out.println("modulus method called");
		System.out.println(a % b);
	}
}
