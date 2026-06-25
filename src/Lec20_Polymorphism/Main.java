package Lec20_Polymorphism;

public class Main {
    static void main(String[] args) {
//        Calculator c = new Calculator();
//        System.out.println(c.add(2,3));
//        System.out.println(c.add(2,3,4));
//        System.out.println(c.add(2,3,4,5.6));

//
//        // runtime polymorphism
//        Circle c = new Circle();
////        c.draw();
//        doDrawStuff(c);
//
//        Rect r = new Rect();
////        r.draw();
//        doDrawStuff(r);
//
//        Shape s = new Shape();
//        doDrawStuff(s);


        // downcasting
        Circle c = new Circle();
        doDrawStuff(c);

//        Rect r = new Rect();
//        doDrawStuff(r);
    }

    public static void doDrawStuff(Shape s){       // in downcasting the shape s can be any  it is generlized
        s.draw();  //polymorphic

        Circle c = (Circle)s;  //downcasting
//        c.draw();
        c.personal();
    }


}
