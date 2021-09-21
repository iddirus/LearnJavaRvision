package basic1;

import basic1.LearnNestedClass.MyPc.MyTv;

public class LearnNestedClass {

	// Nested Class/ child class
	// can we create another class in this class????yes 
	
	int num1=42;
	int nim2=23;
	
	public static void main(String[] args) {
		
	LearnNestedClass Learn = new LearnNestedClass();
	System.out.println(Learn.num1);
		
	MyPc P1 = new MyPc();
	System.out.println(P1.MyPcName);
	System.out.println(MyPc.MyPcPrice);	
	MyPc.MyPcDisplay();
	
	MyPc.MyTv tv1=new MyTv();
	System.out.println(tv1.tvPrice);
	System.out.println(MyPc.MyTv.tvBrand);
	
	
	}
	
	public static class MyPc { // this is called nested class1
		
		String MyPcName="Lenovo";
		static String MyPcPrice="2000";
		
		
		public static void MyPcDisplay() {
			
			System.out.println("MyPc Display");
			
			
		}
		// can we create another nested class inside this nested class? yes 
		
		
		public static class MyTv {
			static String tvBrand="samsung";
			int tvPrice=500;
			
		}
		
		
		
		
	}
	
	
	
	
}
