package Lec15_BasicMaths;

public class BasicMaths {

    static void printDigits(int num){
        //agar mere num=0 ,tho main ruk jaunga
        //agar num!=0 tho main processing krta hu

        while(num!=10){
            int digit = num % 10;
            System.out.println(digit);
        }
    }

    static void main() {

    }
}
