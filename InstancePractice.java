class InstancePractice{
// Declaring instance varible, trying to access from main method and trying to modify 
// it from main method
	
	static int v = 10;
	static String c = "X";
	
	int a = 10;
	double d1 = 11.23;
	
	
	public static void main(String [] args){
		
		
		System.out.println("Inside main method");
		System.out.println("Trying to access instance variable, for that creating object");
		
		InstancePractice o1 = new InstancePractice();
		
		System.out.println(o1.a);
		System.out.println(o1.d1);
		System.out.println("Printing static var");
		System.out.println(InstancePractice.v);
		System.out.println(InstancePractice.c);
		System.out.println("Modifying values of instance variables");
		
		o1.a = 20;
		o1.d1 = 100.123;
		System.out.println(o1.a);
		System.out.println(o1.d1);
		
	}



}