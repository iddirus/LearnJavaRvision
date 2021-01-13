package basic1;

public class LearnStatic {
	// declare variable: declare datatype with variable name 
	int age;
	// declare variable and assign value
	int cost=30;
	
	
	public static String stname="iddir"; // static global variable 
	
	String stAddress="newJersey"; // non static global variable 
	
	
	public static void Cdisplay() { // static method 
		System.out.println("Algeria is Beautiful Country");
	}
	
	public void display() { // non static method 
		System.out.println("sport is good");
		
	}
	
	
	public static void main(String[] args) {
		
		// how can we call a static variable inside main method 
		// static variable call by class name as that variable in class level   
		LearnStatic.stname="Eva"; // reassign value
		LearnStatic.stname="ahcen";
		LearnStatic.stname="vava";
		System.out.println(LearnStatic.stname);
		
		
		// how can we call a non static variable inside main method
		// we have to create an object and call by object name  
		
		// how to create object
		// Class name object name=new ConstructorOfClass();
		
		LearnStatic obj = new LearnStatic(); 
	//obj.stAddress
		System.out.println(obj.stAddress);
		obj.age=38;
		System.out.println(obj.age);
		obj.cost=39;
		System.out.println("cost "+obj.cost);
		
		LearnStatic.Cdisplay();
		obj.display(); // call by object name 
		
	
		
		
		
	}
	
	
	
	
}
