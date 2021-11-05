import java.util.* ;

class HasSingleMax{
	public static void main(String[] args) {
		int a[] = {-6,-6,-6,-6} ;
		System.out.println(hasSingleMax(a)) ;
	}
	
	static int hasSingleMax(int[] a) {
		if(a.length == 0) return 0 ;
		
		int maxValue = a[0] ;
		Map<Integer , Integer> value = new HashMap<>() ;
		
		for(int i = 0 ; i < a.length ; i++ ) {
			
			if(!value.containsKey(a[i]) )  value.put(a[i] , 1 ) ;
			else{ value.put(a[i] , value.get(a[i]) + 1 ) ; }
			
			if(a[i] > maxValue) maxValue = a[i] ;  
		}
		
		System.out.println(maxValue ) ;
		if(value.get(maxValue) > 1 ) return 0 ; 
		
		return 1 ;
	}
}
