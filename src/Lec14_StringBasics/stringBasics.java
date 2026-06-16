package Lec14_StringBasics;

import java.util.Scanner;

public class stringBasics {

    // practice
    //1.each char of string
    static void printString(String str) {
        int n =str.length();
        for (int i=0; i<n; i++){
             char ch = str.charAt(i);
            System.out.println(ch);
        }

    }

    // practice
    //2.length of string without length()
    static int getLengthOfString (String str){
       char[] arr = str.toCharArray();
       int len =arr.length;
       return len;
    }


    // practice
    //3.count vowel in string
    static int getVowelCount(String str) {
        int count = 0;
        for (int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }



    // practice
    //4.reverse string
    static String reverseString(String str){
        String reverse="";
         int n=str.length();
         for (int i=n-1; i>=0; i--){
             char ch = str.charAt(i);
              reverse = reverse + ch;

         }
         return reverse;
    }

    //practice
    //5.check if palindrome
    static boolean isPalindrome(String str){
         String original=str;
         String reverse = reverseString(original);
         // compare
        for(int i=0; i<original.length(); i++){
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);
            if (ch1 != ch2){
                return false;

            }
        }
        //loop se bhar tabhi aaunga
        //jab saare character match krre hoga
        // iska matlab return true
        return true;
    }



    static void main() {
        String str = "Love";
//        printString(str );

//        System.out.println(getLengthOfString(str));

        System.out.println(getVowelCount(str));

        System.out.println(reverseString(str));

        System.out.println(isPalindrome(str));









        // common methods
        //isEmpty() -> length=0
        //isBlank() ->empty or sirf spaces hai string
//        String str ="  ";
//        System.out.println(str.length() );
//        System.out.println(str.isEmpty() );
//        System.out.println(str.isBlank());
//        // trim -> remove space start and end only
//        String name = "  Love     ";
//        System.out.println(name.length());
//        name = name.trim();
//        //just name.trim() was returning string si it was giving 11 we need to store somewhere to get answer
//        System.out.println(name.length());

        //toUpperCase and toLowerCase
//        String name ="love";
//        System.out.println(name.toUpperCase());
//        String str = "LOVE";
//        System.out.println(str.toLowerCase());

        //subString
//        String str ="My Name is Love Babbar";
        //0->m
        //1->y
        //2->space and so on
        //beginIndex 3-> include
        //endIndex 6-> exclusive means not include
//        System.out.println(str.substring(3,6));
        // contains method
//        System.out.println(str.contains("Love "));

        // valueOf method
//        int num = 5123;
//        String str = String.valueOf(num);
//        System.out.println(num+1 );    //gives 5124
//        System.out.println(str+1);     //gives 51231 because 5123 is a string so it concat

        // startsWith endsWith
//        String name = "Rana Love babbar";
//        System.out.println(name.startsWith("Rana L"));
//        System.out.println(name.endsWith("Babbar"));   //should give false because in string babbar and in sufix Babbar

        //toCharArray()
//        String name = "Babbar";
//        char[] crr = name.toCharArray();
//        //print char array
//        for (char ch:crr){
//            System.out.println("value of char: " +ch);
//        }

        // split method -> output  ->string array
//        String input = "My,Name,is,Love,Babbar";
//        String[] words = input.split(",");//gives return string ka array value so store
//        for (String str: words ){
//            System.out.println(str);
//        }

        //replace method
//        String name = "babbar";
//        name = name .replace('b','l');
//        System.out.println(name);



//        String str = "Babbar";
//        System.out.println(str.length());
//        System.out.println(str.charAt(0));
//        String name =  "BABBAR";
//        System.out.println(str.equals(name));
//        System.out.println(str.equalsIgnoreCase(name));








//        // string input
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Provide the string content: ");
//        String str = sc.nextLine();
//        System.out.println("Value of nextLine: "+ str);
//
//        System.out.println("Provide the string content: ");
//        String str2 = sc.next();
//        System.out.println("Value of next: "+ str2);
//


//        String name1 = "love";
//        String name2 = "love";
        // ==
//        if (name1 == name2){
//            System.out.println("string are equal");
//        }
//        else {
//            System.out.println("string are not equal");
//        }
//        // .eqauls
//        if (name1.equals(name2) ){
//            System.out.println("string are equal");
//        }
//        else {
//            System.out.println("string are not equal");
//        }
        // .eqaulsIgnoreCase
//        if (name1.equalsIgnoreCase( name2) ){
//            System.out.println("string are equal");
//        }
//        else {
//            System.out.println("string are not equal");
//        }










//       String firstName = "Love";
//       String lastName = new String("babbar");
//        System.out.println(firstName+" "+lastName );
//        System.out.println(firstName.length());
//        System.out.println(firstName.charAt(0));

//        // string is immutable
//         String name =" Rana";
//         //name[0] = 'B';
//        name = "Bana";
//        System.out.println(name );
    }
}
