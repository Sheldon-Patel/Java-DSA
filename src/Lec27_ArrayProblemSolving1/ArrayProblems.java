package Lec27_ArrayProblemSolving1;

public class ArrayProblems {
    static double getAverage(int [] arr){
        int sum = 0;
        for(int i:arr){
            sum = sum + i;
        }
        int size = arr.length;
        double avg = sum/size;
        return avg;
    }

    static void main() {
    int arr[] ={2,4,3,3};
        System.out.println(getAverage(arr));
    }
}
