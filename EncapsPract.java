class EncapsPract{
	
	// variables to calculate area of rect
	
	private int len;
	private int bred;
	
	public EncapsPract(int len,int bred){
		
		this.len = len;
		this.bred = bred;
		
		
	}
	
	public int getArea(){
		
		int area = len * bred;
		return area;
	}
	public static void main(String[] args){
		
		System.out.println("Inside EncapPract class");
	}

}

class Main{
	
	public static void main(String[] args){
		
		EncapsPract e = new EncapsPract(20,30);
		
		System.out.println(e.getArea());
		
	}
	
	
}
