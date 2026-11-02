package com.constructors;

public class Student {
	
	int roll_number;
	String name;
	int age;

	Student(){
		System.out.println("no-arg called");
		System.out.println("no-arg ended");
	}
	Student(int roll_number,String name,int age)
	{
		System.out.println("Parameterized called");
		this.roll_number=roll_number;
		this.name=name;
		this.age=age;
		
	}
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.StdDetails();
Student s2 = new Student(34,"Santosh",21);
s2.StdDetails();
	}
	void StdDetails(){
		System.out.println("roll number is : "+roll_number);
		System.out.println("Your name is : "+name);
		System.out.println("Your age is : "+age);
	}

}
