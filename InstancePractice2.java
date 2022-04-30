class InstancePractice2{

	//Making of constructor
	
	int empId;
	String empName;
	double empSalary;
	String gender;
	
	final int a = 188;
	final double d1;
	final String s1;
	final int i1;
	
	{
		System.out.println("Inside init block and here we're initiating instance var");
		
		d1 = 54.26;
		
		s1 = "Hello World";
		
	}
	
	InstancePractice2(int empId1, String empName1, double empSalary1, String gender1 ){
		
		empId = empId1;
		empName = empName1;
		empSalary = empSalary1;
		gender = gender1;
		
		i1 = 109;
		
		
		
	}
	
	
	public static void main(String [] args){
		
		System.out.println("\ncreating object and passing values to constructor");
		
		InstancePractice2 o1 = new InstancePractice2(1,"ABC",10000,"Male");
		InstancePractice2 o2 = new InstancePractice2(2,"XYZ",20000,"Male");
		InstancePractice2 o3 = new InstancePractice2(3,"LMN",5000,"Female");
		
		System.out.println("Employee names are as : "+o1.empName+" , "+o2.empName+" , "+o3.empName);
		
		System.out.println(o1.i1);
	}




}