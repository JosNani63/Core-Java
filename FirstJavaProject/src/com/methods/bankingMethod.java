package com.methods;

import java.util.Scanner;

public class bankingMethod {
	double balance = 10000.00;

	void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Welcome to Nani Bank");
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter Amount To Deposit :");
		double Damt = sc.nextDouble();
		Deposit(Damt);

		System.out.println(" Enter Amount to Withdraw : ");
		double Wamt = sc.nextDouble();
		Withdraw(Wamt);

	}

	void Deposit(double amount) {
		System.out.println("The entered amount is : " + amount);
		balance = balance + amount;
		CheckBalance();

	}

	void Withdraw(double amount) {
		System.out.println(" the entered amountis : " + amount);
		if (amount <= balance) {
			balance = balance - amount;
		} else {
			System.out.println("The Balance is Insufficient Please Check The Balance");
		}

		CheckBalance();

	}

	void CheckBalance() {
		System.out.println("The current Balance is : " + balance);

	}
}
