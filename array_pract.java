class array_pract{
	
	public static void main(String[] args){
		
		System.out.println("Printing array");
		
		//int [][] a =new int[3][4];//created 2-D array a of type int
		
		// Initialize array a
		
		int[][] a = {
            {1, 2, 3}, 
            {4, 5, 6, 9}, 
            {7}, 
        };
		
		//System.out.println(a[][]);
        // calculate the length of each row
        /*
		System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);
		*/
		
		/*
		//printing all the elements of array
		
		for (int i = 0; i < a.length;i++){
			System.out.println("Printing "+i+" row");

			for (int j = 0; j < a[i].length; j++){
				//System.out.println("Printing "+i+" th row");
				System.out.println(a[i][j]);
			}
			System.out.println();
			
		}*/
		
		//Another method to print elements of array, this method is used to iterate over the array
		
		for (int[] rows : a ){
			for (int var : rows ){
				System.out.println(var);
			}
		}
    }
	

}