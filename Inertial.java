class Inertial {
	public static void main(String[] args) {
		int[] a = {2 , 4 ,6 ,8 , 10  } ;
		System.out.println(isInertial(a)) ;
	}
	
	static int isInertial(int[] a) {
		int countOdds = 0 ;
		int max = a[0] ;
		
		for(int i = 0 ; i < a.length ; i++) {
			if(a[i] > max) {
				max = a[i] ;
			}
			if(a[i] % 2 != 0 ) countOdds++ ;
		}
		
		if(countOdds == 0 || max % 2 != 0 ) return 0 ;
		
		for(int j = 0 ; j < a.length ; j++) {
			if(a[j] % 2 != 0) {
				for(int k = 0 ; k < a.length ; k++) {
					if(a[k] % 2 == 0 && a[k] < max) 
						if(a[j] < a[k]) return 0 ;
				}
			}
		}
		return 1 ;
	}
}
