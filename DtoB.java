class DtoB{
	
	public static void main(String [] args){
		String s = "";
			int num  = 10;
			int temp = num;
			
			while (temp > 0){
				int r = temp % 2;
				temp = temp / 2;
				s = r + s;
			}
			System.out.println(s);	
	}




}