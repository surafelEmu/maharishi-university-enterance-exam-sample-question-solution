// class array_assign {
//     public static int main(String args[]) {
//         return 0;

//     }

//     int fun5 (int[] array , int lengthArray , int k) {
//         if( array == null) return (Integer) null ;
//         if( array.length < lengthArray ) return (Integer) null ;
//         if( k >= array.length) return (Integer) null ;
//         if( k < 0 ) return (Integer) null ;
//         if( lengthArray < 1 ) return null ;
//         if( k >= lengthArray) return (Integer) null ;

//         int i = 0 ;
//         int[lengthArray] returnArray ;
//         while ( i <= k) {

//             returnArray[i] = array[i] ;
//         }
//     }
// }


class array_assign {
    public static void main(String[] args) {
        System.out.println(fun1(1)) ;
    }

    static int fun1(int number) {
        if (number <= 0 ) return 0 ;
        if (number == 1 ) return 1 ;
        
        int i = 2 ;
        while(i <= number) {
            if(number % 2 == 0) return number/i ;
            else i++ ;
        } 
        return 0 ;
    }
}