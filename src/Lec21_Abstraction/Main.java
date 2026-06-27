//package Lec21_Abstraction;
//
//abstract class Bird{
//    abstract void fly();
//
//    abstract void eat();
//}
//
//
//class Sparrow extends Bird{
//
//    @Override
//    void fly() {
//        System.out.println("sparrow flying alag way sa");
//    }
//
//    @Override
//    void eat() {
//        System.out.println("Sparrow eating");
//    }
//}
//
//class Crow extends Bird{
//
//    @Override
//    void fly() {
//        System.out.println("Crow flying");
//    }
//
//    @Override
//    void eat() {
//        System.out.println("Crow eating alag way sa");
//    }
//}
//
//
//
//
//public class Main {
//
//    static void doBirdStuff(Bird b){
//        b.eat();
//        b.fly();
//    }
//
//    static void main(String[] args) {
////        Bird b = new Sparrow();
////        b.eat();
////        b.fly();
////
////        b = new Crow();
////        b.fly();
////        b.eat();
//        doBirdStuff(new Sparrow());
//        doBirdStuff(new Crow());
//
//    }
//
//}



//interface
package Lec21_Abstraction;

interface Bird{
    void fly();

    void eat();

}


class Sparrow implements Bird{

    @Override
    void fly() {
        System.out.println("sparrow flying alag way sa");
    }

    @Override
    void eat() {
        System.out.println("Sparrow eating");
    }
}

class Crow extends Bird{

    @Override
    void fly() {
        System.out.println("Crow flying");
    }

    @Override
    void eat() {
        System.out.println("Crow eating alag way sa");
    }
}




public class Main {

    static void doBirdStuff(Bird b){
        b.eat();
        b.fly();
    }

    static void main(String[] args) {
//        Bird b = new Sparrow();
//        b.eat();
//        b.fly();
//
//        b = new Crow();
//        b.fly();
//        b.eat();
        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());

    }

}
