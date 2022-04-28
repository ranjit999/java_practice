class Looping{
	
	
	
	public static void main( String [] args){
		
		//For loop example
		
		for (int i = 0; i <= 10 ; i++){
			System.out.println("Value of i is: "+i);
		}
	}



}

class TablePrinting{
	
	public static void main(String [] args){
		// Nested for loop
		
		for (int i = 0; i <= 10; i++){
			System.out.println("Printing table of : "+i);
			
			for (int j = 0; j <= 10; j++){
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			System.out.println("*********************");
		}
	}
}