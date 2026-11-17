package comLogicalStatements;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		System.out.println("Main method Started");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any Cricketer Jersy Number : ");
		int Jersy = sc.nextInt();
		switch(Jersy) {
		
		case 7 :
			System.out.println("MS Dhoni");
			break;
			
		case 18 :
			System.out.println("Virat Kohli");
			break;
			
		case 45 :
			System.out.println("Rohit Sharma");
			break;
			
		case 1 :
			System.out.println("KL Rahul");
			break;
			
			default:
				System.out.println("Given Jersy Number is not found in this list !");
			
		
		}

	}

}
