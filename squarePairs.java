class squarePairs{
	public static void main(String[] args) {
		int[] a = {9 , 0 , 2 , -5 , 7 } ;
		System.out.println(countSquarePairs(a)) ;
	}
	static int countSquarePairs(int[] a) {
		int count = 0 ;
		
		for(int i=0 ; i < a.length ; i++ ) {
			if( a[i] <= 0 ) continue ;
			for(int j = 0 ; j < a.length ; j++ ) {
				if( a[j] <= 0) continue ;
				if(a[i] < a[j]) {
					if(isPerfectSquare(a[i] + a[j]) == 1 ) count++ ; 
				}
			}
		}
		return count ;
	}
	
	static int isPerfectSquare(int a ) {
		
		for(int i= 1 ; i < a ; i++ ) {
			if(i*i == a) return 1 ;
		}
		return 0 ;
	}
}
