import java.util.* ;

class repalaceClustor {
	public static void main(String[] args) {
		int[] a = {0 , 0 , 4 , 4 , 4 , -3 , 0 } ;
		int[] returned = compareclustor(a) ;
		
		for(int i = 0 ; i < returned.length ; i++) {
			System.out.println(returned[i]) ;
		}
	}
	
	static int[] compareclustor(int[] a) {
		Map<Integer, Integer> map = new HashMap<Integer , Integer>() ;
		
		for (int i = 0 ; i < a.length-1 ; i++) {
			if(a[i] != a[i+1]){
				map.put(i , a[i]) ;
			}
		}
		map.put(a.length , a[a.length-1]) ;
		
		int[] array = new int[map.size()] ;
		int j = 0 ;
		for(Map.Entry<Integer , Integer> entry : map.entrySet()) {
			array[j] = entry.getValue() ;
			j++ ;
		}
		
		return array ;
	}
}
