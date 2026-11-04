package com.operators;

import java.util.Scanner;

public class AirthmeticOperator1 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int a = sc.nextInt();
    
    System.out.println("Enter b number : ");
    int b = sc.nextInt();
    
    System.out.println("Addition of two numbers is : "+(a+b));
    
    System.out.println("Substraction of two numbers is : "+(a-b));
    
    System.out.println("Multiplication of two numbers is : "+a*b);
    
    System.out.println("Division of two numbers is : "+a/b);
    
    System.out.println("Modulus of two numbers is : "+a%b);
    

	}

}
