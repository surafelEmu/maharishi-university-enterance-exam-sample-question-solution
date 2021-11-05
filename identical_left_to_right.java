class identical {

	public static void main(String[] args) {
		int[] array = {1,2,3,9,1,2,3} ;
		System.out.println(fun2(array)) ;
		
	}
	static int fun2(int[] array) {
		if(array == null || array.length == 1) return 0 ;
	
		if(array.length % 2 == 0 ) {
			for(int i = 0 , j = array.length/2 ; i < array.length/2 ; i++ , j++) {
				if( array[i] != array[j] ) return 0 ;
			}
		
		} else {
			int mid = array.length / 2 ;
			for(int i = 0 , j = mid + 1 ; i < mid ; i++ , j++ ) {
				if(array[i] == array[mid] || array[j] == array[mid] || array[i] != array[j]) 
				return 0 ;
			}
		}
		
	
		
		
		//int midpoint_right , midpoint_left ;
		
		//if(array.length % 2 == 0 ) {
		//	midpoint_left = array.length / 2 ;
		//	midpoint_right = midpoint_left ;

		//}
		//else {
		//	midpoint_left = (array.length - 1) / 2 ;
		//	midpoint_right = midpoint_left + 1 ;
		//}
		//int i = 0 ;
		//while(midpoint_right < array.length) {
		//	if(array[i] == array[midpoint_right]) {
		//		i++ ;
		//		midpoint_right++ ;
		//	}
		//	else return 0 ;
		//}
		//return 1 ;
		return 1 ;
	}
}
