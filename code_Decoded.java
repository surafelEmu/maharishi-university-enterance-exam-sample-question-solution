class Array_Decoded {
	public static void main(String[] args) {
		int[] array = {0 , -3 , 0 , -4 , 0 } ;
		System.out.println(arrayDecoded(array) );
	}
	
	static int arrayDecoded (int[] array ) {
		
		int num = 0 ;
		
		
		for(int i = 0 ; i < array.length-1 ; i++ ) {
			int sub = 0 ;
			sub = array[i] - array[i+1] ;
			if(sub < 0 ) sub = sub * -1 ;
			System.out.println(num) ;
			
			//num = (num + sub) ;
			//if(i != array.length - 2)
			 num = num * 10 + sub ;
			
		}
		if( array[0] < 0 ) num = num * -1 ;
		
		return num ;
	}
}
