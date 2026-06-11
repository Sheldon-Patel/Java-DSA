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
//              for each row -> variable coloum
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
//        int n=5;
//        for (int row=1; row<=n; row++) {
//              //  for each row -> variable coloum
//                    // spaces
//            for (int col=1; col<=row-1; col++) {
//                System.out.print(" ");
//            }
//            //star
//            for (int col=1; col<=2*n-2*row+1; col++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }



        //pattern 8: holo rectangle
//        int n=4;
//                for (int row=1; row<=n; row++) {
//                // for each row -> 6 columns
//                    for ( int col=1 ;col<=6;col++){
//                        if(row==1|| row==n){
//                            System.out.print("* ");
//                        }
//                        else{
//                            // middle row
////                            if(col==1){
////                                System.out.print("* ");
////                            }
////                            else if(col==6) {
////                                System.out.print("* ");
////                            }
//                            if(col==1 || col==6){
//                                System.out.print("* ");
//                            }
//                            else {
//                                // middle colums
//                                System.out.print("  ");
//                            }
//                        }
//                    }
//                    System.out.println();
//                }



        //pattern 9: holo right angle
//        int n =10;
//        for (int row=1; row<=n; row++) {
//             // for each row ->variable columns
//            if(row==1||row==2||row==n){
//                for(int col=1;col<=row;col++){
//                    System.out.print ("* ");
//                }
//            }
//            else{
//                //middle row
//                // 1*
//                System.out.print("* ");
//                //(row-2)space
//                for(int col=1;col<=(row-2);col++){
//                    System.out.print("  ");
//                }
//                // 1*
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //pattern 10: holo pyramid
//        int n =5;
//        for (int row=1; row<=n; row++) {
//            // for each row ->variable columns
//            //spaces part1
//            for(int col=1;col<=n-row;col++){
//                System.out.print("   ");
//            }
//            //part 2
//            if (row==1||row==n){
//                for(int col=1;col<=2*row-1;col++){
//                    System.out.print("*  ");
//                }
//            }
//            else {
//                //middle row
//                // 1*
//                System.out.print("* ");
//                //2r-3 space
//                for(int col=1;col<=2*row-3;col++){
//                    System.out.print("   ");
//                }
//                // 1*
//                System.out.print("* ");
//
//                }
//            System.out.println();
//        }


        //pattern 11: solid diamond
        // part 1
//        int n=4;
//        for (int row=1; row<=n; row++) {
//            // for each row -> variable coloum
//                   //  spaces
//            for (int col=1; col<=n-row; col++) {
//                System.out.print("  ");
//            }
//       // star
//            for (int col=1; col<=2*row-1; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        //part 2
//        for (int row=1; row<=n; row++) {
//              //  for each row -> variable coloum
//            if(row==1){
//                continue;  //row one was giving extra row so continue is use to skip
//            }
//                    // spaces
//            for (int col=1; col<=row-1; col++) {
//                System.out.print(" ");
//            }
//            //star
//            for (int col=1; col<=2*n-2*row+1; col++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //pattern 12: holo diamond pattern
        // part 1
//        int n=4;
//        for (int row=1; row<=n; row++) {
//            // for each row -> variable columns
//            //spaces part1
//            for(int col=1;col<=n-row;col++){
//                System.out.print("  ");
//            }
//            //part 2
//            if (row==1 ){
//                for(int col=1;col<=2*row-1;col++){
//                    System.out.print("* ");
//                }
//            }
//            else {
//                //middle row
//                // 1*
//                System.out.print("* ");
//                //2row-3 space
//                for(int col=1;col<=2*row-3;col++){
//                    System.out.print("  ");
//                }
//                // 1*
//                System.out.print("* ");
//
//                }
//            System.out.println();
//        }
//        //part 2
//        for(int row =1; row<=(n-1);row++){
//            // each row -> variable column
//
//           // part1
//            for (int col=1;col<=row;col++)
//                System.out.print ("  ");
//            //part2
//            if(row==(n-1)){
//                System.out.print("* ");
//            }
//            else{
//                // remaining row
//               // 1*
//                System.out.print("* ");
//
//                //(2(n-r)-3) space
//                for (int col=1; col<=2*(n-row)-3 ; col++) {
//                    System.out.print("  ");
//                }
//               // 1*
//                System.out.print("* ");
//
//            }
//            System.out.println();
//        }

        //pattern 13: symateric pattern
//        int n=4;
//        for(int row=1; row<=n; row++){
//             // part 1
//            for(int col=1; col<=row; col++){
//                System.out.print("* ");
//            }
//            // part 2
//            for(int col=1; col<=2*(n-row); col++){
//                System.out.print("  ");
//            }
//
//                // part 3
//            for(int col=1; col<=row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        // inverted symmetrical half
//        for(int row=1; row<=n; row++) {
//            // part 4
//            for (int col = 1; col <= n - row + 1; col++) {
//                System.out.print("* ");
//            }
//            //part 5
//            for (int col = 1; col <= 2*(row - 1); col++) {
//                System.out.print("  ");
//            }
//            //part 6
//            for (int col = 1; col <= n - row + 1; col++) {
//                System.out.print("* ");
//            }
//                System.out.println();
//        }



            // pattern 14:numberic pattern
//            int n =5;
//        for (int row=1; row<=n; row++) {
//            // for each row -> variable columns
//            for (int col = 1; col <= row; col++) {
//                System.out.print(col + " ");    //+" " for space it is optional
//            }
//            System.out.println();
//        }

        //pattern 15:right angle with continue number
//        int n=5;
//        int count=1;
//
//        for (int row=1; row<=n; row++){
//           // for each row -> variable columns
//        for(int col=1; col<=row; col++){
//            System.out.print(count + " ");
//            count++;
//
//        }
//            System.out.println();
//        }


        //pattern 16:right angle with alphabets
        int n=5;

        for (int row=1; row<=n; row++) {
            // for each row -> variable columns
            for (int col = 1; col <= row; col++) {
                int a=col;
                int b=('A'-1);
                int ans=a+b;
                char finalAns = (char)ans;
                System.out.print(finalAns+" ");
            }
            System.out.println();
        }


    }
}
