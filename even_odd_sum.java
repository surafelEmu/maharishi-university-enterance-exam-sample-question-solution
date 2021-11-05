class even_odd_sum{
	public static void main(String[] args) {
		int[] array = {4,3,3,4} ;
		
		System.out.println(fun8(array)) ;
	
	}
	
	static int fun8(int[] array) {
		int even_sum = 0 , odd_sum = 0 ;
		
		for(int i = 0 ; i < array.length ; i++ ) {
			if(array[i] % 2 == 0 ) {
				even_sum = even_sum + array[i] ;
			}
			else {
				odd_sum = odd_sum + array[i] ;
			}
		}
		
		return odd_sum - even_sum ;
	}
}
