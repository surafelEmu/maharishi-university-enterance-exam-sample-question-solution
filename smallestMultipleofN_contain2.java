class smallestMultiple {
	public static void main(String[] args) {
		int n = 5 ;
		System.out.println(Smallest(n)) ;
	}
	
	static int Smallest(int n) {
		int i = 1 ;
		boolean flag = true ;
		
		while(flag) {
			int k = 0 ;
			
			int num1 = n * i ;
			int m = i ;
			int num2 = num1 ;
			for (int j = i ; j < m+n ; j++ , i++){
				
				int c = 0 ;
				while(num2 != 0 ) {
					int d = num2 % 10 ;
					num2 = (num2 / 10) ;
					
					if(d == 2) {
						num2 = num2 * j ;
						c = 1 ;
						
						k++ ;
						//return 1 ;
						break ;
					}
					
					
				}
				if( c == 0 ) {
					
					i++ ;
					//k++ ;
					
					break ;
				}
				
				
			}
			System.out.println(k) ;
			System.out.println(num1) ;
			//System.out.println(num1) ;
			if(k == n) {
				return num1 ;
			}
		}
		return 0 ;	
	}
}
