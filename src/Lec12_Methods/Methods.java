package Lec12_Methods;

public class Methods {
    //method declaration//definition
   static void print2KaTable(){
        for (int i = 1; i <=10; i++) {
            int ans= 2*i;
            System.out.println(" -> "+ans);

        }
    }
    static void main() {
        System.out.println("hi");
        // method call
        print2KaTable();
        System.out.println("bye");
    }
}
