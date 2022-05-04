class X{
	
	public void m1(int a, float b,double c){
		
		System.out.println("Parent:m1()");
	} 
	
	public int m2(int a){
		
		//System.out.println("Parent:m2()");
		return 1;
	}
	public void m3(int a){
		
	}
}

class Y extends X {
	
	@Override
	public void m1(int a, float b, double c){
		
		System.out.println("Child:m2()");
	}
	
	@Override
	public int m2(int aa){
		
		return 1;
	}
	@Override
	public void m3(int a){
		
	}
	
	void m3(String s){
		
	}
	
	void m3(){
		
	}
	
	void m3(int a, int b){
		
	}
	
	void m3(double a, int b){
		
	}
}

class Overriding{
		
		public static void main(String[] args){
		X x = new X();
		x.m1(10,20.0f,20.0);
		//x.m2("A",10);
		//x.m3(10);
		
		X x1 = new Y();
		x.m1(10,20.0f,20.0);
		//x.m2("A",10);
		//x.m3(10);
		//x.m3("A");
		//x.m3(10.2f);
		
		Y y = new Y();
		y.m3(10);
		//y.m3("A");
		//y.m3(10.2f);
		
		y.m3(10,10);
		y.m3(10.0,10);
	}
	
	
	
}