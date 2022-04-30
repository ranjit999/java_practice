class InstancePractice3{
	int a;
	double d1;
	
	{
		System.out.println("Inside first init block ");
		a = 11;
		d1 = 12.21;
		System.out.println("Printing a :"+a);
	}
	{
		System.out.println("Inside second init block ");
		a = 15;
		d1 = 56.21;
		System.out.println("Value is"+a);
	}

	public static void main(String [] args){
		System.out.println("Hello");
		
		InstancePractice3 o1 = new InstancePractice3();
		System.out.println(o1.a);
	}





}