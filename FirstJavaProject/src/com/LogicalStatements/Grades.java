package com.LogicalStatements;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your marks : ");

		int marks = sc.nextInt();

		String grade = switch (marks / 10) {

		case 10, 9 -> {
			System.out.println("Marks mukyam bigiluu..!");
			yield "A";
		}

		case 8 -> "B";
		case 7 -> "C";
		case 6, 5, 4 -> "D";
		case 1, 2, 3 -> "Fail";
		default -> "Invalid";

		};

		System.out.println("Grade is : " + grade);

	}

}
