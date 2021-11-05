class common_among_arrays{
	public static void main(String[] args) {
		int[] first = { 1, 8 , 3 ,2 , 7 , 9  } , secound = { 4 , 2 , 6, 1 } ;
		int[] returned = common(first , secound ) ;
		for (int i = 0 ; i < returned.length ; i++) {
			System.out.println(returned[i]) ;
		}
		
		
	}
	
	static int[] common(int[] first , int[] secound ) {
		
		int counter = 0 ;
		int length = 0 ;
		if(first.length > secound.length) {
			length = first.length ;
			
		} else {
			length = secound.length ;
		}
		int[] common = new int[length] ;
		
		for(int i = 0 ; i < length ; i++ ) {
			for(int j = 0 ; j < length ; j++ ) {
				if( first.length <= i || secound.length <= j ) break ;        
				if( first[i] == secound[j] ) {
					common[counter] = first[i] ;
					counter++ ;
				}
			}
		}
		int[] final_output = new int[counter] ;
		
		for ( int i = 0 ; i < counter ; i++ ) {
			final_output[i] = common[i] ;
		}
		
		
		
		
		return final_output ;
	}

}
