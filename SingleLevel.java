class Parent{

	int a = 10;
	int b = 20;
	
	void m1(){
		
		System.out.println("Inside parent method ");
	}
	
	public static void main(String[] args){
		
		System.out.println("Inside class Parent");
		
		// creating an object to access instance variables
		Parent o1 = new Parent();
		
		System.out.println(o1.a);
		o1.a = 50;
		System.out.println(o1.a);
	
	}

}

class Child extends Parent{
		int c = 90;
		void m1(){
			System.out.println("Inside class child");
			
			
		}
	
}

class SingleLevel{
	
	public static void main(String[] args){
		
		Parent p = new Parent();
		
		System.out.println(p.a);
		System.out.println(p.b);
		p.b = 1000;
		System.out.println(p.b);
		p.m1();
		
		Child c1 = new Child();
		c1.m1();
		System.out.println(c1.a);
		System.out.println(c1.b);
		c1.b=777;
		System.out.println("new valuue assigned to b var b= "+ c1.b );
		System.out.println("actual value insdie parent b= :"+p.b);
		
		Parent p2 = new Child();
		
		System.out.println(p2.a);
		System.out.println(p2.b);
		p2.a = 666;
		System.out.println("new val assigned to var a = 666 using upcasting");
		
		p2.m1();
		
	}
	
	
	
}