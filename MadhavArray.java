class madhavArray{
	public static void main(String[] args) {
		int[] a = { 2,1,1,4,-1,-1}  ;
		System.out.println(isMadhavArray(a)) ;
	}
	static int isMadhavArray(int[] a) {
		int n=1 , sum = a[0] , i = 1  , j;
		
		while(i < a.length) {
		
			if(a.length < i*(i+1)/2 ) return 0 ;
			
			int sum1 = 0 ;
			for(j = i ; j <= i+n ; j++) {
				sum1 = a[j] + sum1 ;
			}
			if(sum1 != sum) return 0 ;
			sum = sum1 ;
			i = j ;
			 n++ ;
		}
		
		return 1 ;
	}
}
