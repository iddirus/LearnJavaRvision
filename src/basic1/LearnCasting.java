package basic1;

public class LearnCasting {

	// casting: converting data type
	// primitive data type to primitive data type
	// non primitive to non primitive 
	
	
	public static void main(String[] args) {
		
		double price=45.99;
		int discountPrice= (int)price;
		System.out.println(discountPrice);
		
		int num1=25;
		int num2=45;
		int num3=num1;
		int num4=num3+num2;
		System.out.println("total is "+num4);
		
		
		int age=42;
		double newAge= (double) age;
	
		System.out.println(newAge);
		
		
		int number=72;
		byte total=(byte) number;
		System.out.println("into byte "+total);
		
		// the purpose of all this is to save memory and convert our data
		 
		// non primitive to non primitive 
		 String name="iddir";
		 String stName=name;
		 

		// non primitive to primitive 
		String ssn = "12345";
		int newSsn = Integer.parseInt(ssn);
		System.out.println(newSsn);
		 
		// second approach converting non primitive to primitive data
		
		int newSsn1=Integer.valueOf(ssn);
		System.out.println(newSsn1);
		
		 
		int salary=4500;
		String s =String.valueOf(salary);
	
	    System.out.println(salary);
	
	} 
	
	
	
	
}
