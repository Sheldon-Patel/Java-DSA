package Lec29_ArrayProblemSolving;

// sort array of 0 ans 1
public class Solution {
    public int[] sortArray(int[] nums){

        int n = nums.length;
        int i =0;
        int j= n-1;

        while(i<j){
            if (nums[i]==1 && nums[j]==0){
                //swap
                nums[i]=0;
                nums[j]=1;

            }
            if (nums[i]==0){
                // increment i
                i++;

            }
            if(nums[j]==1){
                //decerement j
                j--;
            }
        }
        return nums;
    }
}


public class Main {
    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {0, 1, 1, 0, 1, 0};

        int[] ans = obj.sortArray(nums);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
