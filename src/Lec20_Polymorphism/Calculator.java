package Lec20_Polymorphism;

public class Calculator {
    int add(int a, int b){
        return a+b;
    }

    //overloading add, 3 int addition
    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(int a, int b, int c, int d){
        return a+b+c+d;
    }
}
