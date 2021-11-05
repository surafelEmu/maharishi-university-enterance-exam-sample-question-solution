class cubePowerful {
	public static void main(String[] args) {
		int num = -81 ;
		System.out.println(isCubePowerful(num)) ;
	}
	
	static int isCubePowerful (int num) {
	
		if(num <= 0 ) return 0 ;
		int number = num;
		int sum = 0 ;
		while (number != 0 ) {
			
			int digit = number % 10 ;
			number = number/10 ;
			
			sum = sum + (digit * digit * digit) ;
			
		}
		if(sum != num) return 0 ; 
		return 1 ;
	}
}
