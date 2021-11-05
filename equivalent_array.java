import java.util.* ;

class equivalent_Array {
	public static void main(String[] args) {
		int[] a1 = {0,1,2,1} , a2 = {3 ,2, 0, 1} ;
		System.out.println(equivalentArray(a1 , a2) ) ;
	}
	static int equivalentArray(int[] a1 , int[] a2 ) {
		Map<Integer , Integer> map1 = new HashMap<>() ;
		Map<Integer , Integer> map2 = new HashMap<>() ;
		
		for (int i = 0 ; i < a1.length ; i++ ) {
			if(!map1.containsKey(a1[i])) map1.put(a1[i] , 1) ;
			else map1.put(a1[i] , map1.get(a1[i]) + 1 ) ;
		}
		
		for (int i = 0 ; i < a2.length ; i++ ) {
			if(!map2.containsKey(a2[i])) map2.put(a2[i] , 1) ;
			else map2.put(a2[i] , map2.get(a2[i]) + 1 ) ;
		}
		
		for(Map.Entry<Integer , Integer> entry : map1.entrySet() ) {
			if(!map2.containsKey(entry.getKey())) return 0 ;
		}
		
		for(Map.Entry<Integer , Integer> entry : map2.entrySet() ) {
			if(!map1.containsKey(entry.getKey())) return 0 ;
		}
		
		return 1 ;
		
	}
}
