package Lec13_Array;

import javax.print.attribute.standard.OrientationRequested;
import java.util.Scanner;

public class Arrays_2D {

    static void main() {
// length tell the number of element in an array


        // sum of element in 2d array
        int arr[][]={{1,2,3},{1,2,3}};
        int sum =0;

        for (int i=0; i<= arr.length-1; i++){
            for (int j=0; j<= arr[i].length-1; j++){
                int value= arr[i][j];
                sum = sum+value;
            }
        }
        System.out.println(sum);


//        int arr[][];
//        arr = new int[3][4];
//                or
//        int arr[][] = new int[3][4];
//        Scanner sc = new Scanner(System.in);
//        // input
//        for (int i=0;i<=arr.length-1;i++){
//            for (int j=0; j<=arr[i].length-1; j++){
//                System.out.println("provide value for row="+i+"and column="+j);
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        // print
//        for(int rowIndex=0; rowIndex<= arr.length-1;rowIndex++){
//            for(int colIndex=0;colIndex<= arr[rowIndex].length-1 ; colIndex++ ){
//                System.out.print(arr[rowIndex][colIndex]+" ");
//            }
//            System.out.println();
//        }



        // decalartion
//    int[][] arr;
        // allocation
//    arr =new int[3][4];
        // init
//    int[][] brr = {
//                    {1, 2},
//                    {2, 3},
//                    {3, 4},
//                    {4, 5}
//                    };
//
////        System.out.println(brr[3][1]);
//        int rowLength = brr.length;        // for row length of 2d array
//        int colLength = brr[0].length;     // for col length of 2d array ,
//         // each row have same number of col so assume any one row length to get col length
//
//        for(int rowIndex=0; rowIndex<= rowLength-1; rowIndex++){
//            for(int colIndex = 0; colIndex<=colLength-1; colIndex++){
//                System.out.print (brr[rowIndex][colIndex]+" ");
//            }
//            System.out.println();
//        }


//        int[][] brr = {     //also called jagged array because have different length
//                {1, 2},
//                {2, 3,4,5},
//                {3, 4,5,6,7 },
//                {4}
//        };

////        System.out.println(brr[3][1]);
//        int rowLength = brr.length;        // for row length of 2d array
////        int colLength = brr[0].length;     // for col length of 2d array ,
//        // each row have same number of col so assume any one row length to get col length
//
//        for(int rowIndex=0; rowIndex<= rowLength-1; rowIndex++){
//            // jaisa hi main kisi new row ma aaya
//            // same point par maine uss row ka colLength find kar liya
//            //current row -> brr[i] //because we dont know the index it might be anything
//            // isma kitna columns hai -> brr[rowIndex].length;
//            int colLength = brr[rowIndex].length;
//            for(int colIndex = 0; colIndex<=colLength-1; colIndex++){
//                System.out.print (brr[rowIndex][colIndex]+" ");
//            }
//            System.out.println();
//        }

        // traversal 2D array   // this is a short version of the above
//        for(int rowIndex=0; rowIndex<= brr.length-1;rowIndex++){
//            for(int colIndex=0;colIndex<= brr[rowIndex].length-1 ; colIndex++ ){
//                System.out.print(brr[rowIndex][colIndex]+" ");
//            }
//            System.out.println();
//        }


    }
}



//homework: Row 0 columns: 2
//Row 1 columns: 5
//Row 2 columns: 10
//Row 3 columns: 1
//
//nt[][] arr = new int[4][];
//
//arr[0] = new int[2];   // Row 0 -> 2 columns
//arr[1] = new int[5];   // Row 1 -> 5 columns
//arr[2] = new int[10];  // Row 2 -> 10 columns
//arr[3] = new int[1];   // Row 3 -> 1 column
//
//         OR
//
//int[][] arr = {
//        new int[2],
//        new int[5],
//        new int[10],
//        new int[1]
//};
