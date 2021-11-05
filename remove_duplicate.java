class removeDuplicate{
	public static void main(String[] args) {
		int[] array = {1,2,1,3,4,2,5 } ;
		int[] returnArray = fun7(array) ;
		
		for(int i = 0 ; i < returnArray.length ; i++ ) {
			System.out.println(returnArray[i]);
		}
	}
	
	static int[] fun7(int[] array) {
		if(array.length == 0) return null ;
		if(array.length == 1 ) return array  ;
		
		int[] copy_Array = new int[array.length] ;
		boolean isDuplicate = false ;
		int counter = 0 ;
		for ( int i = 0 ; i < array.length ; i++ ) {
			isDuplicate = false ;
			
			for ( int j = 0 ; j < array.length ; j++ ) {
				if(array[i] == copy_Array[j] ) {
					isDuplicate = true ;
					break ;
				}
			}
			if( isDuplicate == false ) {
				copy_Array[counter] = array[i] ;
				counter++ ;
			}
		}
		
		return copy_Array ;
	}
}
