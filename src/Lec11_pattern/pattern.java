package Lec11_pattern;

public class pattern {
    static void main() {
    // pattern 1: solid square
//        int n=4;
//        for( int row=1; row<=n; row++){
//            //for each row -> n coloum
//            for (int col=1; col<=n; col++){
//                // print *
//                System.out.print("* ");
//            }
//            // move to next line or row
//            System.out.println();
//        }

        // pattern 2: solid rectangle
//            int n = 3;
//            for(int row=1; row<=n; row++){
//                // for each row-> 5 col
//                for(int col=1; col<=5; col++){
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }

        // patern 3: right angle
            int n=5;
            for(int row=1; row<=n; row++){
                //for each row -> varable coloum
                // formula-> col -> (1->value of row)
                for(int col=1; col<=row;col++ ){
                    System.out.print("* ");
                }
                System.out.println();
            }
    }
}
