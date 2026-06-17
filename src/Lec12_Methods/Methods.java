package Lec12_Methods;

// for return always ask do i want a value back
//return -> how many digits,is it even, which is biggest number
//not return(void) -> print digits, print a table,print a greeting

public class Methods {
    static int value=20;


    //method declaration//definition
   static void print2KaTable(){
        for (int i = 1; i <=10; i++) {
            int ans= 2*i;
            System.out.println(" -> "+ans);

        }
    }

    static  void printSum(int x, int y) {

       System.out.println("sum :"+ (x+y));
    }

    static void printMultiplication(int a, int b){
       int ans= a*b;
        System.out.println("result: " + ans);
    }

    static int add(int p,int q) {
        int sum = p+q;
        return sum;
    }

    static int add(int p,int q,int r) {
        int sum = p+q+r;
        return sum;
    }

    static void solve(int num){
        System.out.println("inside solve " +num);
        num = num*10;
        System.out.println("inside solve " +num);

    }

    static void printMultiple(){
//       int value=20;
       for(int i=1; i<=10; i++){
           System.out.println(20*i);
       }
    }

    static void main() {
        System.out.println( value);
//       int num =5;
//        System.out.println("inside main "+num);
//        solve(num);
//        System.out.println("inside main "+num);

//       int ans1= add(1,2);
//       int ans2= add(1,2,3);
//        System.out.println("ans1: "+ans1);
//        System.out.println("ans2: "+ans2);


//      int result = add(12,13 );
//        System.out.println("RESULT: "+result);
//       printMultiplication(5,10 );
//       printSum(5,10);
//        System.out.println("hi");
//        // method call
//        print2KaTable();
//
//        System.out.println("bye");
    }
}
