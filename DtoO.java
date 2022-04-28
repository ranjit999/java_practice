class DtoO{
	
	public static void main(String [] args){
		
		int i = 25;
		
		
		String s = "";
		
		int r = 0;
		if (i > 7){
			while(true){
				
				r = i % 8;
				
				s = r + s;
				
				i = i / 8;
			}
			System.out.println(s);
		}
		else{
			System.out.println(i);
		}
		
	}
		
		
//	}




}