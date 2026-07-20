package Lec27_ArrayProblemSolving1;

public class ArrayProblems {

//    // avg of all elemnet in array
//    static double getAverage(int [] arr){
////        int sum = 0;
//// we get o/p in double but sum is int so make it double instead of int or throught typecasting
////        if you do one variable double java automaticaly divide in double
//        double sum = 0;
//        for(int i:arr){
//            sum = sum + i;
//        }
//        int size = arr.length;
//        double avg = sum/size;
//        return avg;
//    }
//
//    static void main() {
//    int arr[] ={2,4,1,3};
//        System.out.println(getAverage(arr));
//    }


    // multiply each element by 10 in an array
    static int[] multiplyBy10(int [] arr){
        int size = arr.length;
        int[] newArray = new int[size];

        for(int i=0; i<size ; i++){
            int element = arr[i];
            int newElement = element *10;
            newArray[i] = newElement;
        }
        // return updated array
        return newArray;
    }

    static void main() {
        int arr[]={1,2,3,4,5};
        int ans[] = multiplyBy10(arr);
        System.out.println("printing arr ans");
        for (int i : ans){
            System.out.println(i);
        }
    }
}
