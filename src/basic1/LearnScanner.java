package basic1;

import java.util.Scanner;

public class LearnScanner {

	
	public static void main(String[] args) {
		 
		// class name is scanner 
		// how to create an object of scanner class
		// className objectName=new constructorOfclass();
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter your first name");
		String firstName=input.nextLine();
		System.out.println("fisrt name: "+firstName);
		
		System.out.println("enter your last name");
		String lastName=input.nextLine();
		System.out.println("fisrt name: "+lastName);
		
		System.out.println("full name: "+firstName+" "+lastName);
	
		System.out.println("enter course fee");
		double cfee = input.nextDouble();
		System.out.println("course fee is "+ cfee);

	System.out.println("enter your age");
	int age=input.nextInt();
	System.out.println("my age is "+age);
	
	// to close Scanner
	input.close();
	
	}
	
	
	
	
	
	
}
