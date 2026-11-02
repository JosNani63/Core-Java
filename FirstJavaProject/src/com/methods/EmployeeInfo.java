package com.methods;

import java.util.Scanner;

//EmployeeInfo 
public class EmployeeInfo {

	void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter your salary: ");
		double sal = sc.nextDouble();

		System.out.println("enter your age : ");
		int age = sc.nextInt();

		System.out.println("enter your name : ");
		sc.nextLine();
		String name = sc.nextLine();

		System.out.println("enter your phone : ");
		long phone = sc.nextLong();

		System.out.println(" enter your gender : ");
		char gen = sc.next().charAt(0);

		getEmployeeSalary(sal);
		getEmployeeAge(age);
		getEmployeeName(name);
		getEmployeePhone(phone);
		getEmployeeGender(gen);

		System.out.println("main method ended");
	}

	void getEmployeeSalary(double salary) {
		System.out.println("the current salary is :" + salary);
	}

	void getEmployeeAge(int age) {
		System.out.println("the current age is :" + age);
	}

	void getEmployeeName(String name) {
		System.out.println("Your name is :" + name);
	}

	void getEmployeePhone(long phone) {
		System.out.println("Your number is :" + phone);
	}

	void getEmployeeGender(char gender) {
		System.out.println("Your gender is :" + gender);
	}
}