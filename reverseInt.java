class reverse {
	public static void main(String[] args) {
		int num = 1234 ;
		System.out.println(fun7(num) ) ;
	}
	
	static int fun7(int number) {
		int output = 0 ;
		
		while(number != 0 ) {
			
			output = (number % 10) + (output * 10) ;
			
			number = number / 10 ;
		}
		return output ;
	}
}
