class arrayCopy {
	public static void main(String[] args) {
		int[] array = { 1 , 2 , 3 , 9, 16 , 17 , 3 } ;
		int[] returnArray = fun6(array , 4 , 3 ) ;
		
		for (int i = 0 ; i < returnArray.length ; i++ ) {
			System.out.println(returnArray[i] );
		}
	
	}
	
	static int[] fun6(int[] array , int lengthArray , int k) {
		if(array == null || array.length < lengthArray || array.length <= k || k < 0 || lengthArray < 1 || k >= lengthArray ) {
		 return null ; }
			
		int[] copy_array = new int[lengthArray] ;
		
		int i = 0 , j = 0 ;
		
		while( i < lengthArray ) {
			if( j < k ) {
				copy_array[i] = array[j] ;
			} else {
				j = 0 ;
				continue ;
			}
			i++ ; 
			j++ ;
		
		}
		return copy_array ;
	
	} 

}
