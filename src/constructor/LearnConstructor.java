   package constructor;

   public class LearnConstructor {

	// constructor
	// constructor name should same as class name 
	// constructor has no return type
	// constructor are used to initialize object
	 
	// AcessModifier className() {} : this is the syntax of constructor 
	 
	   // without parameter it is called default constructor
	   // with parameter it is called parameterized constructor
	   
	   String stName;
	   String stAddress;
	   int stAge;
	   double courseFee;
	   String stPhoneNumber; 
	   
	   
	   
	   
	   
	   public LearnConstructor () { 
		
		   // this is default constructor
	
//	   System.out.println("this is default instructor");
//	   int num1=45;
//	   int num2=35; 
//	   int total=num1+num2;
//	   System.out.println("total is "+total);
	   
	   }	
	    // signature pattern 
		// we need to follow parameter
	    // with parameter it is called parameterized constructor
	   
	   
	   public LearnConstructor (String name) {
	    	// single parameterized constructor 
	    	// String name is called parameter
	
	    	System.out.println("Student name is "+name);
	   }    	
	    	
	   // Multi parameterized constructor
	   public LearnConstructor (String name, int age) {
	    	
	    	System.out.println("Father name is "+name+ " age is "+ age);
	   
	   }    	
	   
	   
	   
	   
	   
	   
	  public LearnConstructor (String stName, String stAddress) {
		  this.stName = stName;
		  this.stAddress= stAddress;
	       System.out.println("student name "+this.stName+" Address is " +this.stAddress);
	  
	        } 
	
	public LearnConstructor(String stAddress, String stName, String stPhoneNumber, int stAge, double courseFee) {
		
		this.stAddress=stAddress;
		this.stName=stName;
		this.stPhoneNumber=stPhoneNumber;
		this.stAge=stAge;
		this.courseFee=courseFee;
		System.out.println("student name "+this.stName+" address "+this.stAddress+ " phone number "+this.stPhoneNumber+ " age is "+this.stAge+ " course fee paid "+this.courseFee);
		
	}
	  public LearnConstructor (int courseFee) {
		  this.courseFee=courseFee;
		  
		 double courseFeeAfterDiscount=this.courseFee*.90;
		  System.out.println("course fee after discount "+courseFeeAfterDiscount);
		  
	  }
	  
	  
	public static void main(String[] args) {
		
		// className objectName= new constructorOfClass(); : this is object
		
		LearnConstructor Learn = new LearnConstructor();
		
		LearnConstructor student = new LearnConstructor("iddir");// argument passing
		
		LearnConstructor ahmed =new LearnConstructor("ahmed hammou");
		
		LearnConstructor ahcen =new LearnConstructor("ahcen hadjal", 67);
	
	    LearnConstructor iddir=new LearnConstructor("iddir hadjal", "jersey city, NJ");
	
	    LearnConstructor ghania=new LearnConstructor("jersey city,NJ","Ghania Meziani ","2019209757",31,5000.500);
	
	LearnConstructor Iddir=new LearnConstructor(5000); 
	
	}
	
	
	
	
	
	

}
