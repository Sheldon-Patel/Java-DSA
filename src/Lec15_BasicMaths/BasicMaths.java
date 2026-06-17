package Lec15_BasicMaths;

public class BasicMaths {

    static void printDigits(int num1){
        //agar mere num=0 ,tho main ruk jaunga
        //agar num!=0 tho main processing krta hu

        while(num1!=0){
            int digit = num1 % 10;
            System.out.println(digit);
            // remove last digit
            num1 = num1/10;
        }
    }

    static void main() {
        int num = 53217;
        printDigits(num);
    }
}
