package com.methods;

//return with no parameters
public class Calculator {

	void main(String[] args) {
		System.out.println("Main Method Started");
		int s = Addition();
		System.out.println("the resulted sum is : " + s);

		double M = Multiplication();
		System.out.println("The Product of the NUmbers is : " + M);

		double d = division();
		System.out.println("the remainder is : " + d);

	}

	int Addition() {
		int a = 100;
		int b = 200;
		int sum = a + b;
		return sum;
	}

	double Multiplication() {
		int a = 100;
		int b = 200;
		int c = 300;
		return a * b * c;
	}

	double division() {
		int a = 30;
		int b = 10;
		return a / b;
	}

}