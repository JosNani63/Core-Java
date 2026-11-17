package comLogicalStatements;

import java.util.Scanner;

public class nestedIfElse {
	
	public static void main(String args[]) {
		System.out.println("Telugu Matrimony");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name : ");
		String fname = sc.nextLine();
		
		System.out.println("Hello Mr."+fname );
		System.out.println("Please tell me about your Assests Value..!");
		double Assests = sc.nextDouble();
		
		if(Assests >= 20000000) {
			System.out.println("Its Sounds good..! Now we talk about more");
		
		System.out.println("what is your age..!");
		int age = sc.nextInt();
		if (age>=25 && age<=29 ) {
			System.out.println("Yeah perfect age you have");
		
		System.out.println("do you have any siblings.!");
		boolean Siblings = sc.nextBoolean();
		if(!Siblings) {
			System.out.println("Hoo great who is the wgat we are looking for..!");
		}
		else {
			System.out.println("Sorry your profile not match with my daughter profile..!");
		}	
		}
		
		else {
			System.out.println("Sorry we are not looking for this age..!");
		}
		}
		
	

		else {
			System.out.println("Sorry.! We Will Talk to you later");
		}
		
		}



		
	

}

