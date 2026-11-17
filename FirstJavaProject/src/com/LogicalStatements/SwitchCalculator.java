package com.LogicalStatements;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Calculator");

		Scanner sc = new Scanner(System.in);
        String yn = "";
		do{
			System.out.println("Enter number a : ");
		
		int a = sc.nextInt();

		System.out.println("Enter number b :");
		int b = sc.nextInt();

		System.out.println("Enter a Calculation Symbol : ");
		char symb = sc.next().charAt(0);

		int result = 0;

		switch (symb) {

		case '+' -> result = (a + b);

		case '-' -> result = (a - b);

		case '*' -> result = (a * b);

		case '/' -> result = (a / b);

		case '%' -> result = (a % b);

		default -> {
			result = 0;
			System.out.println("The given symbol is invalid");
		}
		}

		System.out.println("The result is : " + result);
		
		System.out.println("Do you want to continue the Calculations..? Click y for Yes and n for No..!");
		yn = sc.next();
		}while(yn.equalsIgnoreCase(yn));
		
		System.out.println("Main Method Closed");
	}

}
