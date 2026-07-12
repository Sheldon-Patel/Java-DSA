public class Lec26_BitwiseOperator {
    static void main() {

        int a = 5;
        int b = 6;

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);

        int n = 5;
        for(int i = 1; i<=32; i++){
            n = n << 1;
            System.out.println(n);

        }
    }
}
