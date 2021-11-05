class largest_adj_sum {
	public static void main(String[] args) {
		int[] array = {1,1,1,1} ;
		int len = array.length ;
		System.out.println(largestAdjacentSum(array , len) );
	}
	
	static int largestAdjacentSum(int a[] , int len) {
		if(len < 2 ) return -1 ;
		
		int largest_sum = 0 ;
		
		for(int i = 0 ; i < len-1 ; i++) {
			int sum = a[i] + a[i+1] ;
			
			if( sum > largest_sum) {
				largest_sum = sum ;
			}
		}
		return largest_sum ;	
	}
}
