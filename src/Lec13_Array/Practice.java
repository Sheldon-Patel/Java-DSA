package Lec13_Array;

public class Practice {

    // max value find out
    static void main() {


        int[] arr = {3, 6, 2, 9, 1};
        int maxValue = arr[0];
        int n = arr.length;

        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
            System.out.println(maxValue);


    }
}
