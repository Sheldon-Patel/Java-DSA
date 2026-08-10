package Lec27_ArrayProblemSolving1;

public class ArrayProblems {

//    // average of all elemnet in array
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


//    // multiply each element by 10 in an array
//    static int[] multiplyBy10(int [] arr){
//        int size = arr.length;
//        int[] newArray = new int[size];
//
//        for(int i=0; i<size ; i++){
//            int element = arr[i];
//            int newElement = element *10;
//            newArray[i] = newElement;
//        }
//        // return updated array
//        return newArray;
//    }
//
//
//
//    static void main() {
//        int arr[]={1,2,3,4,5};
//        int ans[] = multiplyBy10(arr);
//        System.out.println("printing arrat answer");
//        for (int i : ans){
//            System.out.println(i);
//        }




//        //linear search - (search for an element in an array)
//        static boolean findTarget(int [] arr, int target){
//            for (int i=0; i<arr.length; i++){
//                if (arr[i] == target){
//                    return true;
//                }
//            }
//            // agar poora array travel ho chuka hai
//            // and ek bhar be target nahi mila
//            // iska matlab target is not present in the array so return false
//            return false;
//        }
//
//    static void main() {
//        int[]arr={2,5,3,1,7};
//        boolean ans = findTarget(arr,7);
//        System.out.println(ans);
//    }



//    max element in an array
//    static int getMaximun(int arr[]){
//            int maxi = arr[0];
//
//            for (int i=0; i<arr.length; i++){
//                if (arr[i] > maxi) {
//                    maxi = arr[i];
//                }
//            }
//            // jab ma vaha pochunga, tho pura array compare ho chuka hoga
//        // and maxi ka ander sabse badi value hogi
//            return maxi;
//    }


// using Math.max()
//static int getMaximun(int arr[]){
//    int maxi = arr[0];
//
//    for (int i=0; i<arr.length; i++){
//            maxi = Math.max(arr[i],maxi);
//        }
//
//    // jab ma vaha pochunga, tho pura array compare ho chuka hoga
//    // and maxi ka ander sabse badi value hogi
//    return maxi;
//}
//    static void main() {
//                int[]arr={2,5,3,1,7,9};
//        System.out.println(getMaximun(arr));
//
//    }


    //return sum of positive and negative elements
//    static int[] getPosNegSum(int arr[]){
//        int posSum = 0;
//        int negSum = 0;
//
//        for (int i=0; i<arr.length;i++){
//            if (arr[i] > 0){
//                //num is positive
//                posSum = posSum + arr[i];
//            }
//            else {
//                //num is negative
//                negSum = negSum + arr[i];
//            }
//        }
//        int ans[]={posSum,negSum};
//        return ans;
//
//    }
//
//    static void main() {
//        int arr[]={2,-3,-5,-7,9};
//        int ans[]=getPosNegSum(arr);
//        System.out.println("positive sum: "+ans[0]);
//        System.out.println("negative sum: "+ans[1]);
//
//    }


    // count the number of zero and one
//static int[] getZeroOneCount(int arr[]){
//    int zeroCount = 0;
//    int oneCount = 0;
//
//    for (int i = 0; i < arr.length; i++) {
//        if(arr[i] == 0){
//            zeroCount++;
//        }
//        else{
//            oneCount++;
//        }
//
//    }
//    int ans[] ={zeroCount,oneCount};
//    return ans;
//}
//
//
//    static void main(){
//        int arr[] ={1,0,1,1,0,1,1};
//        int ans[] = getZeroOneCount(arr);
//        System.out.println("Zero count"+ans[0]);
//        System.out.println("One count"+ans[1]);
//    }



    // find unsorted element in the array
    static int getUnsortedElement(int arr[]){
        for (int i=0; i< arr.length; i++){
            if
        }
    }
    }

