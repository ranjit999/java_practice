class array_pract2{

	public static void main(String[] args){
		
		// Delcaration of 1-D array
		System.out.println("Delcaration of 1-D array");
		int[] a1;
		
		// allocating memory to array a1
		System.out.println("allocating memory to array a1");
		a1 = new int[4];
		
		// initializing array a1
		
		a1[0] = 10;
		a1[1] = 20;
		a1[2] = 30;
		a1[3] = 40;
		
		for ( int i = 0; i < a1.length; i++){
			System.out.println(a1[i]);
		}
	}




}