class concat_sum{
	public static void main(String[] args) {
		int num = 9 , catlen = 1;
		System.out.println(checkConcatenatedSum(num , catlen) );
	}
	static int checkConcatenatedSum(int n , int catlen) {
		int sum = 0 ;
		int num = n ;
		 while( num != 0 ) {
			int d = num%10 ;
			num = num/10 ;
			
			int concat_dig = 0 ;
			for (int i = 0 ; i < catlen ; i++ ) {
				concat_dig = (concat_dig * 10) + d ;
			}
			System.out.println(d) ;
			System.out.println(concat_dig) ;
			System.out.println(num) ;
			sum = sum + concat_dig ;
			System.out.println(sum) ;
			
		}
		
		if( sum == n ) {
			return 1 ;
		}
		
		return 0 ;
	}
}
