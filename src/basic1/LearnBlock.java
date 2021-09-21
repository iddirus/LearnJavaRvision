package basic1;

public class LearnBlock { // Class start point 

	// what is block
	
	
	{ // Block start point 
		
		// in between the start and the end point called Block body	
		
	System.out.println("good morning");
	System.out.println("is this a block");
	
	
	} // Block end point 
	
	public static void learnmentoring()   {
		
		// method /function 
		
		System.out.println("this is our learnmentoring method");
		{
			
			System.out.println("this is from inside the block");
		}	
	}
	
	
	public static void main(String[] args) {
		
		// what is block
		
		
		{ // Block start point 
			
			// in between the start and the end point called Block body	
			
		System.out.println("good morning");
		System.out.println("is this a block");
		
		
		} // Block end point 
		
		// to call display method inside main method 
		// static method / variable can call by class name 
		
	LearnBlock.learnmentoring();

	
	}
	
	
	} // class end point 
