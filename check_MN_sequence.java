class check_MN_sequence{
	public static void main(String[] args) {
		int[] array = {5, 4, 3, 2 , 1 } ;
		int m = 5 , n = 1 , len = array.length ;
		
		System.out.println(isSequencedArray(array , len , n , m ) ) ;
	}
	
	static int isSequencedArray(int a[] , int len , int n , int m) {
		if(a[0] != m || a[len-1] != n || m>n ) return 0 ;
		
		for (int i=0 ; i < len-1 ; i++) {
			if(a[i+1] > a[i] ) {
				if(a[i+1] != a[i]+1) return 0 ;
			}
		}
		
		return 1 ;
	}

}
