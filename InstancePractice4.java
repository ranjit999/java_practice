class InstancePractice4{
	static int a =10;
	void method1(int a,int b){
		System.out.println(a+b);
	}
	public static void main(String [] args){
		
		InstancePractice4 o1 = new InstancePractice4();
		
		
		o1.method1(10,20);
		
		System.out.println(InstancePractice4.a);
	}
}