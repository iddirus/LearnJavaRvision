package basic1;

public class LearnObject {

	// how to create object
	// className objectName = new contructorOfclass
	
	int num1=35;
	int num2=56;
	String name="iddir hadjal";
	String country ="Algeria";
	
	public static void main(String[] args) {
		
		LearnObject Learn = new LearnObject();
		
		int total =Learn.num1+Learn.num2;
		System.out.println("total value is "+total);
		
		System.out.println(Learn.name+" "+Learn.country+" "+total);
		
		// can we create multiple object of same class????? yes
		
		LearnObject obj = new LearnObject();
		obj.num1=47;
		obj.num2=46;
		
		int output=obj.num1*obj.num2;
		System.out.println("the output is "+output);
		
		
		// can we create another class object here??? yse
		
		LearnDatType DatType=new LearnDatType(); 
		
		//DatType.cousefee
		System.out.println(DatType.cousefee);
		DatType.isAvailable=false;
		System.out.println(DatType.isAvailable);
	
	// can we call another methods here ????yes 
	
	LearnStatic ls= new LearnStatic();
	
	ls.display(); // non static method called by object name 
	LearnStatic.Cdisplay(); // static method called by class name 
	
	
	}
	
	
	
	
	
	
	
	
}
