package com.operators;

public class UnaryOperator1 {

	public static void main(String[] args) {
		System.out.println("main method started");

		int a = 5;
		int b = 6;

		System.out.println(+a);//5
		System.out.println(+b);//6
		
		System.out.println(++a);//5-->6
		System.out.println(a--);//6-->5
		System.out.println(b++);//6-->7
		System.out.println(--b);//7-->6
		System.out.println(a++);//5-->6
		System.out.println(--a);//6-->5
		System.out.println(--b);//6-->5
		System.out.println(b--);//5-->4
		System.out.println(++b);//4-->5
		System.out.println(a++);//5-->6
		System.out.println(a--);//6-->5
		System.out.println("*************************");
		System.out.println(a);//5
		System.out.println(b);//5
		System.out.println("*************************");
		System.out.println(a+b);//10
		System.out.println(++a + ++b);//12
		System.out.println("A value is : "+a);//6
		System.out.println("B value is : "+b);//6
		System.out.println(++a - ++b + --a + ++b);//14
		

	}

}
