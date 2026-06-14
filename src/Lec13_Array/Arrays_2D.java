package Lec13_Array;

public class Arrays_2D {

    static void main(){

    // decalartion
    int[][] arr;
    // allocation
    arr =new int[3][4];
    // init
    int[][] brr = {
                    {1, 2},
                    {2, 3},
                    {3, 4},
                    {4, 5}
                    };

//        System.out.println(brr[3][1 ]);
        int rowLength = brr.length;        // for row length of 2d array
        int colLength = brr[0].length;     // for col length of 2d array ,
         // each row have same number of col so assume any one row length to get col length

        for(int rowIndex=0; rowIndex<= rowLength-1; rowIndex++){
            for(int colIndex = 0; colIndex<=colLength-1; colIndex++){
                System.out.print (brr[rowIndex][colIndex]+" ");
            }
            System.out.println();
        }


}
}
