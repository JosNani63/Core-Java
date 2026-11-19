
package com.LogicalStatements;

import java.util.Scanner;

public class MarketPOC2 {

	public static void main(String[] args) {

		System.out.println("SUPER MARKET");

		Scanner sc = new Scanner(System.in);

		int all_fruit_total = 0;
		double all_veg_total = 0;

		System.out.println("Enter the Category (fruits/Vegitables):");
		String catg = sc.next();

		String yn = "";

		do {

			switch (catg) {

			case "fruits" -> {

				String fyn = "";

				do {

					System.out.println("Enter the Fruit:");
					String fruit = sc.next();

					switch (fruit) {

					case "orng" -> {
						System.out.println("Orange 1kg = 100rs");
						all_fruit_total += 100;
					}

					case "mng" -> {
						System.out.println("Mango 1kg = 120rs");
						all_fruit_total += 120;
					}

					case "apple" -> {
						System.out.println("Apple 1kg = 150rs");
						all_fruit_total += 150;
					}

					case "bnana" -> {
						System.out.println("Banana 1kg = 50rs");
						all_fruit_total += 50;
					}

					default -> System.out.println("Fruit not available");

					}

					System.out.println("Do you want more fruits? Press y for yes or n for no:");
					fyn = sc.next();

				} while (fyn.equalsIgnoreCase("y"));

				System.out.println("Total Fruit Bill: " + all_fruit_total);

				System.out.println("Do you want to switch to Vegetables?");
				System.out.println("Press y for Vegetables or n for Final Bill:");
				yn = sc.next();

				if (yn.equalsIgnoreCase("y")) {
					catg = "Vegitables";
				}

			}

			case "Vegitables" -> {

				String vyn = "";

				do {

					System.out.println("Enter veg item:");
					String veg_item = sc.next();

					double veg_price = 0;

					switch (veg_item) {

					case "tmt" -> {
						System.out.println("Tomato per kg is 50 rs");
						veg_price = 50;
					}

					case "ptt" -> {
						System.out.println("Potato per kg is 40 rs");
						veg_price = 40;
					}

					case "onion" -> {
						System.out.println("Onion per kg is 60 rs");
						veg_price = 60;
					}

					case "carrot" -> {
						System.out.println("Carrot per kg is 70 rs");
						veg_price = 70;
					}

					case "brinjal" -> {
						System.out.println("Brinjal per kg is 45 rs");
						veg_price = 45;
					}

					case "cabbage" -> {
						System.out.println("Cabbage per kg is 35 rs");
						veg_price = 35;
					}

					case "beans" -> {
						System.out.println("Beans per kg is 80 rs");
						veg_price = 80;
					}

					case "chilli" -> {
						System.out.println("Chilli per kg is 90 rs");
						veg_price = 90;
					}

					case "cucumber" -> {
						System.out.println("Cucumber per kg is 30 rs");
						veg_price = 30;
					}

					case "spinach" -> {
						System.out.println("Spinach per kg is 25 rs");
						veg_price = 25;
					}

					default -> System.out.println("Entered veg is not available");

					}

					all_veg_total += veg_price;

					System.out.println("Do you want to enter veg again? Press y for yes or n for no:");
					vyn = sc.next();

				} while (vyn.equalsIgnoreCase("y"));

				System.out.println("Total Vegetable Bill: " + all_veg_total);

				System.out.println("Do you want to switch to Fruits?");
				System.out.println("Press y for Fruits or n for Final Bill:");
				yn = sc.next();

				if (yn.equalsIgnoreCase("y")) {
					catg = "fruits";
				}

			}

			default -> {
				System.out.println("Given Category is Not in the List!");
				yn = "n";
			}

			}

		} while (yn.equalsIgnoreCase("y"));

		System.out.println("\n========== FINAL BILL ==========");
		System.out.println("Total Fruit Bill: " + all_fruit_total);
		System.out.println("Total Vegetable Bill: " + all_veg_total);
		System.out.println("--------------------------------");
		System.out.println("Grand Total: " + (all_fruit_total + all_veg_total));
		System.out.println("================================");

		System.out.println("Thank You for Shopping!");

	}
}
