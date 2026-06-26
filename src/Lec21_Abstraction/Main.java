package Lec21_Abstraction;

abstract class Bird{
    abstract void fly();

    abstract void eat();
}


class Sparrow extends Bird{

    @Override
    void fly() {
        System.out.println("sparrow flying");
    }

    @Override
    void eat() {
        System.out.println("Sparrow eating");
    }
}




public class Main {
    static void main(String[] args) {
        Bird b = new Bird();
        b.eat();
        b.fly();
    }

}
