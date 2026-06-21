package Lec17_CLASSandOBJECT;

public class Student {
     // attribute
    public int id;
    public int age;
    public String name;
    public int nos;         //number of subject ->nos

    //default constructor// attribute. ->garbage
    public student(){
        System.out.println(x:"Student Default constructor called");
    }

    //method or behaviours
    public void study(){
        System.out.println(name + "studying");
    }

    public void sleep(){
        System.out.println(name + "sleeping");
    }

    public void bunk(){
        System.out.println(name + "bunking");
    }
}
