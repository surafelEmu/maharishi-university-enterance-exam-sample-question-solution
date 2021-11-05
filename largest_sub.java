class large_sub {
	public static void main(String[] args) {
		int[] array = {12,54,8,3,41} ;
		System.out.println(fun5(array) );
	}
	static int fun5(int[] array) {
		if(array == null || array.length == 1) return -1 ;
		
		
		int large_sub = 0 ;
		
		for(int i = 0 ; i < array.length ; i++ ) {
			for( int j = 0 ; j < array.length ; j++ ) {
				if(i == j) continue ;
				
				int sub = array[i] - array[j] ;
				
				if(sub > large_sub ) large_sub = sub ;
				
			}
			//if( large_sub > largest_sub ) largest_sub = large_sub ;
		}
		return large_sub ;
	}
}
