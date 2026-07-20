package Lec27_ArrayProblemSolving1;

public class ArrayProblems {
    static double getAverage(int [] arr){
//        int sum = 0;
// we get o/p in double but sum is int so make it double instead of int or throught typecasting
//        if you do one variable double java automaticaly divide in double
        double sum = 0;
        for(int i:arr){
            sum = sum + i;
        }
        int size = arr.length;
        double avg = sum/size;
        return avg;
    }

    static void main() {
    int arr[] ={2,4,1,3};
        System.out.println(getAverage(arr));
    }
}
