class is235Array {
	public static void main(String[] args) {
		int[] array = {2 ,3 , 4 ,5,6, 7,8,9, 10 } ;
		System.out.println(is235Arrays(array)) ;	
	}
	static int is235Arrays (int[] a) {
		int sum = 0 ;
		for (int i = 0 ; i < a.length ; i++ ) {
			if(a[i] % 2 == 0 ) sum++ ; 
			if(a[i] % 3 == 0 ) sum++ ;
			if(a[i] % 5 == 0 ) sum++ ;
			if(a[i] % 2 != 0 && a[i] % 3 != 0 && a[i] % 5 != 0 ) sum++ ;
		}
		System.out.println(sum) ;
		
		if( a.length != sum ) return 0 ;
		return 1 ;
	}
}
