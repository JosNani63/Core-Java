package com.LogicalStatements;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
	System.out.println("Main Methos Started");
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a Number : ");
	int age = sc.nextInt();
	
	if(age>=18)
		System.out.println("Congratulations you are eligibe for voting & driving");
		
	else 
		System.out.println("Sorry You have a time to apply");
	}

}
