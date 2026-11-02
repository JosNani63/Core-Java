package com.constructors;

public class cricket1 {
	String pname;
	int age;
	String country;
	int runs;

	// No-arg Constructor
	cricket1() {
		System.out.println("no arg called");
		pname = "Dhoni";
		age = 41;
		country = "India";
		runs = 14756;
	}

	cricket1(String p) {
		pname = p;

	}

	cricket1(String p, int a) {

		pname = p;
		age = a;
	}

	cricket1(String p, int a, String c) {

		pname = p;
		age = a;
		country = c;
	}

	cricket1(String p, int a, String c, int r) {

		pname = p;
		age = a;
		country = c;
		runs = r;
	}

	public static void main(String[] args) {
		cricket1 c = new cricket1();
		c.cricInfo();

		cricket1 c1 = new cricket1("Virat");
		c1.cricInfo();

		cricket1 c2 = new cricket1("virat", 31);
		c2.cricInfo();

		cricket1 c3 = new cricket1("virat", 32, "India");
		c3.cricInfo();

		cricket1 c4 = new cricket1("virat", 32, "India", 15000);
		c4.cricInfo();
	}

	void cricInfo() {
		System.out.println("Player name is : " + pname);
		System.out.println("Player age is : " + age);
		System.out.println("Player country is : " + country);
		System.out.println("Player runs is : " + runs);
		System.out.println("******************************");
	}
}