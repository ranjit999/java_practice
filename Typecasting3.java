
class Typecasting3{
	public static void main (String [] args){
	
	System.out.println("Widening typcasting");
	int i = 10;
	System.out.println(i);
	double d = i;
	System.out.println(d);
	double e = (double) i;
	System.out.println(e);
	
	}


}

class Typecasting4{
	public static void main(String [] args){
		
		System.out.println("Narrowing typecasting");
		double d = 10.87;
		System.out.println(d);
		int i = (int) d;
		System.out.println(i);
		
	}
}