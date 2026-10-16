package com.methods;

public class StundentInfo {

	void main(String[] args) {
		System.out.println("main method started");

		getStudentAge(22);
		getStudentName("Satya", "Santosh");

		System.out.println("main method ended");
	}

	void getStudentAge(int age) {
		System.out.println("student age is :" + age);
	}

	void getStudentName(String fname, String lname) {
		System.out.println("full name of student is : " + fname + " " + lname);
	}
}
