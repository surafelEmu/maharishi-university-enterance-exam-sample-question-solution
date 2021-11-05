
class even_odd {

	public static void main(String[] args) {
	
	int[] array = {1 , 6, 3, 4, 8, 7} ;
	System.out.println(fun3(array) ) ;
	}
	
	static int fun3(int[] array) {
	
		if(array == null ) return 0 ;
		if( array.length <= 3 ) return 0 ;

		int evenIndex = array[0] , oddIndex = array[1] ;
		int i = 2 ;
		while(i < array.length) {
			if( (i % 2 == 0 ) && (array[i] > evenIndex) ) {
				evenIndex = array[i] ;
			}
			else if( (i % 2 != 0 ) && (array[i] < oddIndex) ) {
				oddIndex = array[i] ;
			}
			else return 0 ;
			
			i++ ;
		}
		
		return 1 ;
	}

}


