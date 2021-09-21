package problemsandsolutions;

import java.util.Scanner;

public class TakesTwoNumbersAsInputAndDisplayTheproductOfTheTwonumbers {

	
	
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("input first number: ");
		int num1=in.nextInt();
		System.out.println("input second number: ");
		int num2=in.nextInt();
		int product=num1*num2;
		System.out.println(num1+ " x " + num2 + " = " + product);
		
		in.close();
		
	}
	
	
	
}
