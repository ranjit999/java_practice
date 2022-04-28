class DtoH{
	
	public static void main(String [] args){
		
		
		char hexachars[] ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		int d = 10;
		String s = "";
		while (d > 0){
			
			int r = 0;
			r = d % 16;
			s = hexachars[r] + s;
			d = d / 16;
			
		}
		System.out.println(s);
	}



}