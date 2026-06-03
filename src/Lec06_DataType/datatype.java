
public class datatype {
    static void main() {

        // explicit typecasting
        long value1 = 123456789;
        int value2 = (int)value1;
        System.out.println(value2);



        //numeric datatype: byte,short,int,long
        byte num1 = 5;
        System.out.println(num1);
        //implicit typecasting
        long newNum = num1;
        System.out.println("new num:" + newNum);

        short num2=500;
        System.out.println(num2);

        int num3=50000;
        long num4=39957958;
        System.out.println(num3);
        System.out.println(num4);

    //floating DT: float,double
        float num5=3.14f;
        System.out.println(num5);

        double num6=3.141539745;
        System.out.println(num6);

    // others char,boolean
        boolean eligibleToVote=true;
        System.out.println(eligibleToVote );

        char FirstCharacter = 'a';
        System.out.println(FirstCharacter);
        System.out.println("my first char"+(char)(FirstCharacter+2));
    //+2 gives 99 not c so to get c we explicit or forcefully use (char)
    }
}
