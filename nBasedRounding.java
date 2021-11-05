class nBasedRounding {

	public static void main(String[] args) {
		int[] array = { 1 ,2 ,3 ,4 ,5} ;
		int n = 2 ;
		array = doIntegerBasedRounding(array , n) ;
		for (int i = 0 ; i < array.length ; i++ ) {
			System.out.println(array[i] );
		}
		
		
	}
	static int[] doIntegerBasedRounding(int[] a  , int n) {
		if(a.length < 0 ) return null;
		
		for(int i = 0 ; i < a.length ; i++ ) {
			
			int lowerBound = (a[i]/n)*n ;
			int upperBound = lowerBound + n ;
			int middleElement = n%2 == 0 ? lowerBound + n/2 : lowerBound + n/2 + 1 ;
			if(a[i] >= middleElement) a[i] = upperBound ;
			else a[i] = lowerBound ;
		}
		return a ;
	}
}
