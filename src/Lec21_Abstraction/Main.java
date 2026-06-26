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

class Crow extends Bird{

    @Override
    void fly() {
        System.out.println("Crow flying");
    }

    @Override
    void eat() {
        System.out.println("Crow eating");
    }
}




public class Main {
    static void main(String[] args) {
        Bird b = new Sparrow();
        b.eat();
        b.fly();

        b = new Crow();
        b.fly();
        b.eat();

    }

}
