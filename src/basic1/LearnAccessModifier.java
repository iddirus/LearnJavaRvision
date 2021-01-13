package basic1;

public class LearnAccessModifier {

	// Access modifier or Access specifier 
	// we an use the Access Modifier in: class, variable,method
	// types of Access Modifier
	// public: we can call or use within the class where it is located and from any other class
	// which might be outside of a package
	// private: Only we can call or use within the class where it is located 
	// protected: Only accessible from all the class of that particular package 
	
	// Public 
	// Private
	// Protected
	// Default
	
	private static int age=40;
	protected static int salary=5000;
	
	static String fatherName="Ahcen Hadjal"; 
	
	
	public static void main(String[] args) {
		
	System.out.println(LearnDatType.mobileBrand);
		
	System.out.println(LearnDatType.firstName);
		
	System.out.println(LearnAccessModifier.age);
	
	
	int num1=65;
	System.out.println(num1);
	
	
	}
	
	
	
	
	
	
}
