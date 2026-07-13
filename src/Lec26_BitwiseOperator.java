public class Lec26_BitwiseOperator {
    static void main() {

        int a = 5;
        int b = 6;

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);

//        bitwise left shift
//        int n = 5;
//        for(int i = 1; i<=32; i++){
//            n = n << 1;
//            System.out.println(n);


        // bitwise right shift
//            int n = 100;
//        for(int i = 1; i<=10; i++){
//            n = n >> 1;
//            System.out.println(n);
//        }

// odd even
//        int n = 11;
////        if(n % 2 ==0){
//        if((n&1) == 0){
//            System.out.println("even");
//        }
//        else {
//            System.out.println("odd");
//    }


        // power of 2

        //brute approch
//    int n = 5;
//    int count = 0;
//    while(n != 0){
//        if((n&1) != 0) {
//            // mujha set bit milgyi
//            count++;
//        }
//        // right shift to move this bit
//        n = n >> 1;
//    }
//        System.out.println("set bit count " +count);


        //  better approch
//        int n = 16;
//        if((n & (n-1)) == 0){
//            System.out.println("power of 2 hai");
//        }
//        else {
//            System.out.println("not power of 2");
//        }


        System.out.println(3<<2);
        //3*2*2

        System.out.println(16>>2);
        //16/(2*2)  2 ke power 2 sa

        //remove last bit
        int n = 10;
        System.out.println((n&(n-1)));

        // last set bit


    }
}
