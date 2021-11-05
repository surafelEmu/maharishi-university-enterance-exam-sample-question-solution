

class factor {
    public static void main(String[] args) {
        
       
        int[] array = {1 , 3 , 2 , 5 } ;

        System.out.println(array.length) ;

        //System.out.println(fun1(1)) ;

    }


    static int fun1(int number) {
        if (number <= 0 ) return 0 ;
        if ( number == 1 ) return 1 ;

        int i = 2  ;
        while(i <= number) {
            if(number % i == 0) return number/i ;
            else i++ ;
        }
        return 0 ;
    }
    
}