class InstancePractice1{

	//Declaring instance variable and initiating it in init{} block
	
	int a;
	int b;
	double d1;
	float f1;
	
	{
		a = 123;
		b = 322;
		d1 = 89.23;
		f1 = 56.34f;
	}

	public static void main(String [] args){
		System.out.println("Printing instance variables : ");
		
		InstancePractice1 o1 = new InstancePractice1();
		System.out.println(o1.a);
		System.out.println(o1.b);
		System.out.println(o1.d1);
		System.out.println(o1.f1);
		
		
	
	
	}




}