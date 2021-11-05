class countPrime {
	public static void main(String[] args) {
		int start = -10 , finish = 6  ;
		System.out.println(count_prime(start , finish)) ;
	}
	
	static int count_prime(int start , int finish) {
		
		int count = 0 ;
		
		for (int i = start ; i <= finish ; i++ ) {
			int flag = 0 ;
			for(int j = 1 ; j <= i/2 ; j++) {
				if(i % j == 0) flag++ ;
				if(flag > 1) break ;
			}
			if(flag == 1) count++ ;
		}
		
		return count ;
	}
}
