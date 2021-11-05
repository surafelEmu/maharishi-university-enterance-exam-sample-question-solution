import java.util.* ;

class equivalent {
	public static void main(String[] args){
		int[] first = {1 , 3} , secound = {4 , 5} ;
		int[] returnedArray = fun(first , secound) ;
		for (int i = 0 ; i < returnedArray.length ; i++ ) {
			System.out.println(returnedArray[i]) ;
		}
	}
	
	static int[] fun(int[] first , int[] secound) {
		Map<Integer , Integer> map1 = new HashMap<>() ;
		Map<Integer , Integer> map2 = new HashMap<>() ;
		Map<Integer , Integer> map3 = new HashMap<>() ;	
		for (int i = 0 ; i < first.length ; i++ ) {
			if(!map1.containsKey(first[i]) ) {
				map1.put(first[i] , 1) ;
			}
		else {
			map1.put(first[i] , map1.get(first[i]) + 1 ) ;
				
		}
		}
		
		for (int i = 0 ; i < secound.length ; i++ ) {
			if(!map2.containsKey(secound[i])) {
				map2.put(secound[i] , 1) ;
			}
		else {
			map2.put(first[i] , map2.get(secound[i]) + 1 ) ;
				
		}
		}
			int j = 0 ;
			Map<Integer , Integer> m3 = new HashMap<>() ;
		for(Map.Entry<Integer , Integer> entry : map1.entrySet() ) {
			if(!map2.containsKey(entry.getKey())) continue ;
			
			map3.put(entry.getKey() , 1) ;
			
		}	
		
		int[] rArray = new int[map3.size()] ;
		
		for(Map.Entry<Integer , Integer> entry : map3.entrySet() ) {
			rArray[j] = entry.getKey() ;
			j++ ;
		}
		
		return rArray ;
		
		
	}
}
