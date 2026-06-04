package Lec08_Input_Output;

import java.math.BigInteger;
import java.util.Scanner;

public class TakingInput {
    static void main() {

//        int a = 5;
//        int b = 1;
//        System.out.println(a+b);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for first num:");
        int firstNum = sc.nextInt();
        System.out.println("Enter the value for second num");
        int secondNum = sc.nextInt();
        int ans = firstNum + secondNum;
        System.out.println("ans:"+ans);

        BigInteger bg = sc.nextBigInteger();
        System.out.println("big integer:"+bg);

        boolean flag = sc.nextBoolean();
        short shortVal = sc.nextShort();
        System.out.println(" ");
    }
}
