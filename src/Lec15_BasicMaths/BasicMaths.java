package Lec15_BasicMaths;

// for return always ask do i want a value back
//return -> how many digits,is it even, which is biggest number
//not return(void) -> print digits, print a table,print a greeting


import java.util.function.DoubleToIntFunction;

public class BasicMaths {
// print digits in a number
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

    //count digit in an number
    static int countDigits(int num1){
        //agar mere num=0 ,tho main ruk jaunga
        //agar num!=0 tho main processing krta hu
        int count =0;
        while(num1!=0){
            int digit = num1 % 10;
            count++;
            // remove last digit
            num1 = num1/10;
        }
        return count;
    }

    //  sum of digits in number
    static int sunDigits(int num1){
        //agar mere num=0 ,tho main ruk jaunga
        //agar num!=0 tho main processing krta hu
        int sum =0;
        while(num1!=0){
            int digit = num1 % 10;
            sum = sum + digit;
            // remove last digit
            num1 = num1/10;
        }
        return sum;
    }

    //reverse a number
    static int reverseNum(int num){
        int revNum =0;
        //ans = ans*10 + currentDigit;
        while(num != 0){
             int digit = num % 10;
             // reverse number calculates per formula
            revNum = revNum*10 + digit;
            num = num/10;

        }
            return revNum;
    }


    //palindrome
    static boolean isPalindrome(int num){
         int originalNumber = num;
         int reverseNumber = reverseNum(num);
          if(originalNumber == reverseNumber){
              System.out.println("palindrome");
              return true;
          }
          else{
              System.out.println("not palindrome");
              return false;
          }
    }


    //prime number
    static boolean isPrimeOrNot(int num){
                for (int i=2; i*i<=num; i++){   //optimize

//        for (int i=2;  i<=num-1; i++){        //brute
            if (num % i == 0){
                return false;
            }
        }
        //yaha thabi pocha pagge, jab loop sa bhar nikloge
        // or loop sa bhar tabhi nikloge jab
        //reminder ma zero naa aaya
        //aur kabi reminder 0 nahi aaya its a prime number
        return true;

    }


    //gcd or hcf
    static int getGCD(int a,int b){
        //gcd(a,b) = gcd(b,a%b)
        while(b != 0){
            int oldValueOfb = b;
            b = a%b;
            a = oldValueOfb ;
        }
        // jab mera b 0 hoga tab a ki place par gcd hoga
            int ans = a;
        return ans;
    }

    //lcm    lcm*hcf = a*b    lcm= a*b/hcf or gcd
    static int getLCM(int a,int b){
        int gcd = getGCD(a,b);
        //gcd(18,12) = 6
        int prod = a*b;
        //prod(a,b) -> 216
        int lcm = prod/gcd;
        //216/6
        return lcm;
    }

    static void main() {
        System.out.println(getLCM(18,12));
        System.out.println(getGCD(18,12));

//        int num = 12;
//        System.out.println(isPrimeOrNot(num));

//        boolean ans = isPalindrome(1234);
//        System.out.println(ans );
//
//        int num =1234;
//        int revNum = reverseNum(num);
//        System.out.println(revNum);



//        int num = 53217;
////        printDigits(num);
//
//         int ans = countDigits(num);
//        System.out.println(ans);
//
//        int sum = sunDigits(num);
//        System.out.println(sum);
    }
}
