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

        System.out.println(" enter the flag ");
        boolean flag = sc.nextBoolean();
        System.out.println(" enter the short ");
        short shortVal = sc.nextShort();
        System.out.println(" enter the float ");
        float floatValue = sc.nextFloat();


        System.out.println("boolean:"+flag);
        System.out.println("short:"+shortVal);
        System.out.println("float:"+floatValue);


        sc.close();
    }
}
