class promeFactor{
	public static void main(String[] args) {
		int n = 6936 ;
		encodedNumber(n) ;
	}
	
	static int encodedNumber(int n) {
		int len = 0 ;
		int num = n ;
		int p = 2 ;
		int[] array = new int[100] ;
		
		while(p <= num ) {
			
			if(num % p == 0 ) {
				//System.out.println(num) ;
				//System.out.println(p) ;
				array[len] = p ;
				num = num / p ;
				
				len++ ;
			}
			else{

			
				if(p == 2 ) p = p + 1 ;
				else{ p = p + 2 ;} 
			
			}
			
		}
		System.out.println(len) ;
		
		int[] array2 = new int[len] ;
		for (int i = 0 ; i < len ; i++ ) {
			System.out.println(array[i] );
			array2[i] = array[i] ;
		}
		return  1;
	}
}
