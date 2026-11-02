package com.constructors;

public class cricket {
	String pname;
	int age;
	String country;
	int runs;

	// No-arg Constructor
	cricket() {
		System.out.println("no arg called");
		pname = "Dhoni";
		age = 41;
		country = "India";
		runs = 14756;
	}

	cricket(String pname) {
		this.pname = pname;
	
	}
	cricket(String pname, int age) {
		
		this.pname = pname;
		this.age = age;
	}
	cricket(String pname, int age, String country) {
		
		this.pname = pname;
		this.age = age;
		this.country = country;
	}

	cricket(String pname, int age, String country, int runs) {
	
		this.pname = pname;
		this.age = age;
		this.country = country;
		this.runs = runs;
	}



	public static void main(String[] args) {
		cricket c = new cricket();
		c.cricInfo();

		cricket c1 = new cricket("Virat");
		c1.cricInfo();
		
		cricket c2 = new cricket("virat",31);
		c2.cricInfo();
		
		cricket c3 = new cricket("virat",32,"India");
		c3.cricInfo();
		
		cricket c4 = new cricket("virat",32,"India",15000);
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
