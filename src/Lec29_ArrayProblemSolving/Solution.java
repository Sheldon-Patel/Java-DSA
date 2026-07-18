package Lec29_ArrayProblemSolving;


// sort array of 0 ans 1


//time complexity: O(n)
//space complexity: O(1)

//public class Solution {
//    public int[] sortArray(int[] nums) {
//
//        int n = nums.length;
//        int i = 0;
//        int j = n - 1;
//
//        while (i < j) {
//            if (nums[i] == 1 && nums[j] == 0) {
//                //swap
//                nums[i] = 0;
//                nums[j] = 1;
//
//            }
//            if (nums[i] == 0) {
//                // increment i
//                i++;
//
//            }
//            if (nums[j] == 1) {
//                //decerement j
//                j--;
//            }
//        }
//        return nums;
//    }
//
//
//    //from gpt to run the code on ide
//        public static void main (String[]args){
//
//            int[] arr = {1, 0, 1, 0, 1, 0};
//
//            Solution obj = new Solution();
//
//            int[] ans = obj.sortArray(arr);
//
//            for (int x : ans) {
//                System.out.print(x + " ");
//            }
//        }
//
//    }



// Missing value
//time complexity: O(n)


//class Solution {
//    public int missingNumber(int[] nums) {
//        int xorSum = 0;
//
//        //xor with all the array element
//        for(int n:nums){
//            xorSum = xorSum ^ n;
//        }
//
//        //xor all the element in the range
//        int n = nums.length;
//        for(int i= 0; i<= n; i++){
//            xorSum = xorSum ^ i;
//        }
//
//        return xorSum;
//    }
//}


// unique element in array
//time complexity: O(n)

public class Solution{

    public static int findUnique(int[] arr){
        //Your code goes here
        int xorSum = 0;
        for(int n:arr){
            xorSum = xorSum ^ n;
        }
        return xorSum;
    }
}
