class POE {
	public static void main(String[] args) {
		int[] array = {1 , 8 , 3 , 7 , 10 , 2 } ;
		System.out.println(poe(array)) ;
	}
	static int poe(int[] array) {
		for (int i = 1 ; i < array.length ; i++ ) {
			int sum_left = 0 , sum_rigth = 0 ;
			
			for(int j = 0 ; j < array.length ; j++ ) {
				if(i > j) sum_left = sum_left + array[j] ;
				else if(i < j) sum_rigth = sum_rigth + array[j] ;
				
			}
			if(sum_rigth == sum_left) return i ;
		}
		
		
		return -1 ;
	}
}
