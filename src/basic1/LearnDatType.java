package basic1;

public class LearnDatType {

	// what is data:  
	// data type: 
	// primitive data type
	// numeric
	 int age=40;
	static byte ram=30;
	short number=500;
	double salary=5500.50;
	
	
	long ssn=77135621523l;
	float cousefee=4500.66f;
	
	
	// primitive data type non numeric
	
	char pizzaSize='L';
	boolean isAvailable=true;
	 
	// non primitive 

	String name="iddir";
	// String can take any type of value but inside the double quote ""
	// Array: can take multiple data at the time but datatype has to be the same  
	
	
	public static String shirtColor="black";
	public static String firstName="Eva";
	
	
	public static void main(String[] args) {
		
		int num1=25;
		int num2=36;
		int total=num1+num2;
		System.out.println(total);
		
	String firstName="iddir";
	String lastName="Hadjal";
	String fullName=firstName+" "+lastName;
	System.out.println(fullName);
	// LearnAccessmodifier.
	System.out.println(LearnAccessModifier.name);
	  
	System.out.println(LearnAccessModifier.fatherName);
	
	
	}
	
	
	
	
	
}
