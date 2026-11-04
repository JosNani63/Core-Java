package com.operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		System.out.println("Main Method Started");

		int result = 5;
	//	result = (int) (result + 6.7);//Type mismatch: cannot convert from double to int
		result +=6.7;//Narrowing
		System.out.println(result);//11
		
		result -= 3.9;
		System.out.println(result);//7
		
		result *= 4.9;
		System.out.println(result);//34
		
		result /= 2.5;
		System.out.println(result);//13
		
		result %= 2.5;
		System.out.println(result);//0
		
		 
		
		

	}

}
