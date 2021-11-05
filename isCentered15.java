class isCentered15 {
	public static void main(String[] args) {
		int[] array = { 2, 10 , 4 , 1 , 6 ,9 } ;
		System.out.println(isCentered(array)) ;
	}
	
	static int isCentered(int[] array) {
		for (int i = 0 ; i < array.length ; i++ ) {
			int sum = 0 ;
			
			for (int j = i ; j < array.length ; j++ ) {
				sum = sum + array[j] ;
				System.out.println("The sum: " + sum ) ;
				if(sum > 15) break ;
				
				if(sum == 15) {
					System.out.println( i + " " + 
					" " + j + " " +  ((array.length - 1) - j)) ;
					if(i == ((array.length - 1) - j) ) { return 1 ; }
					}
			}
		}
		return 0 ;
	}
}
