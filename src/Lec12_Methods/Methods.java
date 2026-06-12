package Lec12_Methods;

public class Methods {
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

    static void main() {
      int result = add(12,13 );
        System.out.println("RESULT: "+result);
       printMultiplication(5,10 );
       printSum(5,10);
        System.out.println("hi");
        // method call
        print2KaTable();

        System.out.println("bye");
    }
}
