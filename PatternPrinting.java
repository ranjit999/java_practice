class PatternPrinting{
	
	public static void main(String [] args){
		/*
			*
			* *
			* * *
			* * * *
		*/
		/*
		for (int i =0; i <= 5; i++){
			for( int j = 1; j <= i; j++){
				
				System.out.print("*");
			}
			System.out.println("");
		}
		*/
		
		/*
		// printing above pattern in reverse order
		for (int i = 5; i >= 1; i--){
			for ( int j = 1; j <= i; j++){
				System.out.print("* ");
			}
			System.out.println("");
			}
		*/
		
		
		//Printing both the pattern together
		int r = 5;
		for (int i = 1; i <= r; i++){
			
			for (int j = 1; j <= i; j++){
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		for (int i = r-1; i >= 1; i--){
			
			for (int j = 1; j <= i; j++){
				System.out.print("* ");
				
			}
			System.out.println("");
		}
		
		
		
		//Printing opposite pattern of above
		
		//int r = 5;
		//String c = " ";
		
		//First for loop for number of rows
		for (int i = 1; i <= r; i++){
			
			// Second for loop for spacing purpose
			for (int j = r-1; j >= i; j--){
				
				System.out.print(" ");
			}
			
			//third for loop for printing special charecter
			for (int k = 1; k <= i; k++){
				
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for ( int i = 1; i <= r-1; i++){
			
			for (int j = 1; j <= i; j++){
				
				System.out.print(" ");
			}
			
			for (int k = r-1; k >= i; k--){
				
				System.out.print("*");
			}
			System.out.println("");
		}
	}





}