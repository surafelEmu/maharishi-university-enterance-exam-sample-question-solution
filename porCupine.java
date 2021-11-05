class porCupine{
	public static void main(String[] args) {
		int a = 19 ;
		System.out.println(nextPorcupine(a)) ;
	}
	static int nextPorcupine(int a ) {
		int i = a + 1 ;
		int flag = 0 ;
		while(flag == 0) {
			if( isPrime(i) == 1 ) {
				int d = i % 10 ;
				if( d == 9 ) {
					return i ;
				}
			}
			i++ ;
		}
		return 0 ;
	}
	
	static int isPrime(int a) {
		for(int i = 2 ; i < a/2 ; i++ ) {
			if( a % i == 0 ) return 0 ;
		}
		return 1 ;
	}
}
