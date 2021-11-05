import java.util.* ;

class depthOfN {
	public static void main(String[] args) {
		int n = 42 ;
		System.out.println(depth(n)) ;
	}
	
	static int depth(int n) {
		
		//int[] digits = new int[10] ;
		int depth = 0 ;
		boolean flag = true ;
		int i = 1 , index = 0 ;
		
		Map<Integer , Integer> digits = new HashMap<>() ;
		
		while(flag) {
			int num = n * i ;
			depth++ ;
			while(num != 0) {
				int d = num % 10 ;
				num = num / 10 ;
				
				if(!digits.containsKey(d)){
					digits.put(d , 1) ;
				}
				
				//if(doesItExist(d , digits) == 0){
				//	digits[index] = d ;
				//	index++ ;
				//}
				
			}
			if(doesItContainAll(digits) == 1) {
				flag = false ;
			}
			else{
				//System.out.println(digits[i]) ;
				i++ ; 
			}
		}
		return depth ;
	}
	
	static int doesItExist(int d , int[] digits) {
		for(int i = 0 ; i < digits.length ; i++) {
			if(digits[i] == d) {
				return 1 ;
			}
		}
		return 0 ;
	}
	
	static int doesItContainAll(Map<Integer , Integer> digits) {
		for(int i = 0 ; i < 10 ; i++ ) {
			//System.out.println(digits[i] ) ;
			//int flag = 1 ;
			
			if(!digits.containsKey(i)) {
				return 0 ;
			}
			
			//for (int j = 0 ; j < digits.length ; j++ ) {
			//	if(i == digits[j]) {
			//		flag = 1 ;
			//		break ;
			//	}
			//}
			//if(flag == 0 ) {
			//	return 0 ;
			//}
	}
	return 1 ;
}
}
