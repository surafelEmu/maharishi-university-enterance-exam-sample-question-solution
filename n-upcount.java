class Upcount{
	public static void main(String[] args) {
		int[] a = {2 , 3 , 1 , -6 , 8 , -3 , -1 ,2 } ;
		int n = 3 ;
		System.out.println(upCount(a , n)) ;
	}	
	
	static int upCount(int[] a , int n) {
		int[] partialSum = new int[a.length] ;
		int upcount = 0 ;
		
		 partialSum[0] = a[0] ;
		for(int i = 1 ; i < a.length ; i++) {
			
			
				partialSum[i] = a[i] + partialSum[i-1] ;
				if(a[i] > partialSum[i-1]) upcount++ ;
		
		}
		
		return partialSum[n] ;
	}
}


