package com.LogicalStatements;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {
		System.out.println("Main method Started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Week day : ");
		String day = sc.next();
		switch (day) {

		case "Monday" -> {
			System.out.println("This Day is a Working day");
			System.out.println("We need to Work");
		}

		case "Tuesday" -> {
			System.out.println("This Day is a Working day");
			System.out.println("We need to Work");
		}

		case "Wednesday" -> {
			System.out.println("This Day is a Working day");
			System.out.println("We need to Work");
		}

		case "Thursday" -> {
			System.out.println("This Day is a Working day");
			System.out.println("We need to Work");
		}

		case "Friday" -> {
			System.out.println("This Day is a Working day");
			System.out.println("We need to Work");
		}

		case "Saturday" -> {
			System.out.println("Weekend Started");
			System.out.println("We need to Enjoy");
		}

		case "Sunday" -> {
			System.out.println("This is Sunday Funday");
			System.out.println("Today is a jolly day");
		}

		default -> System.out.println("Given Day is Invalid");

		}

	}

}
