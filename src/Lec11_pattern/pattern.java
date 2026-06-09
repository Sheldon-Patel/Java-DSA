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
//            int n=5;
//            for(int row=1; row<=n; row++){
//                //for each row -> varable coloum
//                // formula-> col -> (1->value of row)
//                for(int col=1; col<=row;col++ ){
//                    System.out.print("* ");
//                }
//                // move to next line
//                System.out.println();
//            }

        // patern 4: solid rhombus
//            int n=5;
//            for(int row=1; row<=n; row++){
//                // for each row :space,star
//// the col variable is in different for loop so its ok
//                //space
//                for (int col=1; col<=n-row; col++){
//                    System.out.print("  ");
//                }
//                //star
//                 for(int col=1; col<=n; col++){
//                     System.out.print("* ");
//                 }
//                System.out.println();
//            }

//        // pattern 5: inverted right angle triangle
//        int n=5;
//        for (int row=1; row<=n; row++){
//                 //for each row -> variable coloum
//
//            for (int col=1; col<=n-row+1; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //pattern 6:solid pyramid
//        int n=5;
//        for (int row=1; row<=n; row++) {
////                 for each row -> variable coloum
//                    // spaces
//            for (int col=1; col<=n-row; col++) {
//                System.out.print(" ");
//            }
        //star
//            for (int col=1; col<=2*row-1; col++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //pattern 7:inverted solid pyramid
        int n=5;
        for (int row=1; row<=n; row++) {
//                 for each row -> variable coloum
                    // spaces
            for (int col=1; col<=row-1; col++) {
                System.out.print(" ");
            }
            //star
            for (int col=1; col<=2*n-2*row+1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
