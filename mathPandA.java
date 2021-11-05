class Match{
	public static void main(String[] args) {
		int[] A = {1 ,2 ,-5 , -5 , -5 ,2, 3, 18} ;
		int[] P = {2 , -3 , 3} ;
		
		System.out.println(match(A , P)) ;
	}
	
	static int match(int[] A , int[] P) {
		int sum = 0 ;
		for(int k = 0 ; k < P.length ; k++) {
			if(P[k] == 0) {
				return 0 ;
			}
			if(P[k] < 0 ) sum = sum + (P[k] * -1) ;
			else{
				sum = sum + P[k] ;
			}
			
		}
		//System.out.println(sum + " " + A.length) ;
		if(sum != A.length) return 0 ;
		
		int j = 0 , l = 0 ;
		for (int i = 0 ; i < P.length ; i++) {
			
			int sign ;
			//System.out.println(P[i]) ;
			//System.out.println(P[i]) ;
			if(P[i] < 0 ) sign = -1 ;
			else{ sign = 1 ; } 
			//System.out.println(k) ;
			//System.out.println(sign) ;
			int  m = (sign * P[i]) + j ;
			for(j = l ; j < m ; j++) {
				System.out.println(j) ;
				//System.out.println(A[j]) ;
				if(sign == 1) {
					if(A[j] < 0) return 0 ;
				}else if(sign == -1) {
					if(A[j] > 0) return 0 ;
				}
				
				
			}
			l = j ;
			
		}
		
		return 1 ;
	}
}
