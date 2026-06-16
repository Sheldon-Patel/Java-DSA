package Lec14_StringBasics;

import java.util.Scanner;

public class stringBasics {
    static void main() {
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
        String str ="My Name is Love Babbar";
        //0->m
        //1->y
        //2->space and so on
        //beginIndex 3-> include
        //endIndex 6-> exclusive means not include
        System.out.println(str.substring(3,6));


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
