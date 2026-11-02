package com.methods;

import java.util.Scanner;

public class SalaryProcess {

	String EmployeeName;
	double salary;
	double Bonus;
	double tax;

	public static void main(String[] args) {
		System.out.println("Welcome to the salary Process");
		SalaryProcess s = new SalaryProcess();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Name : ");
		s.EmployeeName = sc.nextLine();

		System.out.println("Enter your Salary : ");
		s.salary = sc.nextDouble();

		System.out.println("Enter your Bonus : ");
		s.Bonus = sc.nextDouble();

		System.out.println("Enter your tax : ");
		s.tax = sc.nextDouble();

		double TotalBonus = s.CalculateBonus(s.salary,s.Bonus);
		double TotalSalary = s.CalculateSalary(s.salary,TotalBonus);
		double Tax = s.CalculateTax(TotalSalary);
		double TSalary = s.FinalSalary(TotalSalary,Tax);
        s.DisplaySummary(TotalBonus,Tax,TSalary);
	}

	double CalculateBonus(double salary, double Bonus) {
		double TotalBonus = salary * Bonus / 100;
		return TotalBonus;
	}

	double CalculateSalary(double salary, double TotalBonus) {
		double TotalSalary = salary + TotalBonus;
		return TotalSalary;

	}

	double CalculateTax(double TotalSalary) {
		double Tax = TotalSalary * tax / 100;
		return Tax;
	}

	double FinalSalary(double TotalSalary, double Tax) {
		double TSalary = TotalSalary - Tax;
		return TSalary;
	}

	void DisplaySummary(double TotalBonus, double Tax , double TSalary ) {
		System.out.println("Your name is : " + EmployeeName);
		System.out.println("Your Salary is : " + salary);
		System.out.println("Your Bonus is : " + TotalBonus);
		System.out.println("Your Tax is : " + Tax);
        System.out.println("Your hand salary is : " + TSalary);


	}

}
