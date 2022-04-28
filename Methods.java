class Methods{
	
	static void Add(int a, int b){
		
		System.out.println(a+b);
	}
	
	static void Sub(int a, int b){
		
		System.out.println(b-a);
	}
	
	static void Div(int a, int b){
		
		System.out.println(a/b);
	}
	
	static void Mul(int a, int b){
		
		System.out.println(a*b);
	}
	
	int = 1;
	
	choice = '/';
	
	public static void main(String [] args){
		
		Switch (choice) {
			
			case '+':{
				
				Add(10,20);
				break;
			}
			
			case '-':{
				
				Sub(20,10);
				break;
			}
			
			case '/':{
				
				Div(20,10);
				break;
			}
			case '*':{
				
				Mult(10,20);
				break;
			}
			
		}
		
	}


}