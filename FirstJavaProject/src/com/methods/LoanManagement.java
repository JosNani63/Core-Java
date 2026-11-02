package com.methods;

import java.util.Scanner;

public class LoanManagement {

	String CustomerName;
	double LoanAmount;
	double InterestRate;
	int LoanTenure;

	public static void main(String[] args) {
		LoanManagement l = new LoanManagement();
		System.out.println("Main method started");
		System.out.println("Welcome to Loan Management System");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Name : ");
		l.CustomerName = sc.nextLine();

		System.out.println("Enter amount : ");
		l.LoanAmount = sc.nextDouble();

		System.out.println("Enter interest rate : ");
		l.InterestRate = sc.nextDouble();

		System.out.println("Enter Loan Tenure : ");
		l.LoanTenure = sc.nextInt();

		double interest = l.calculateinterest(l.LoanAmount, l.InterestRate);
		double totalAmount = l.calculatetotalamount(interest);
		double emi = l.calculateMonthlyEMI(totalAmount, l.LoanTenure);
		l.DisplaySummary(interest, totalAmount, emi);

	}

	double calculateinterest(double amount, double rate) {
		double interest = (rate * amount * LoanTenure) / 100;
		return interest;
	}

	double calculatetotalamount(double interest) {
		double totalAmount = LoanAmount + interest;
		return totalAmount;
	}

	double calculateMonthlyEMI(double totalAmount, int tenure) {
		int months = tenure * 12;
		double emi = totalAmount / months;
		return emi;
	}

	void DisplaySummary(double interest, double totalAmount, double emi) {
		System.out.println("Your Name  is : " + CustomerName);
		System.out.println("Your Loan Amount  is : " + LoanAmount);
		System.out.println("Your Interest rate   is : " + InterestRate + "%");
		System.out.println("Your Loan Tenure  is : " + LoanTenure + "years");
		System.out.println("Your total Interest is : " + interest);
		System.out.println("Your Total Amount  is : " + totalAmount);
		System.out.println("Your Monthly EMI  is : " + emi);
	}
}
