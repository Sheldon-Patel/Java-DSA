package Lec21_Abstraction;

abstract class Bird{
    abstract void fly();

    abstract void eat();
}


class sparrow implements Bird{

    @Override
    void fly() {
        System.out.println("sparrow flying");
    }

    @Override
    void eat() {

    }
}




public class Main {

}
