package Lec18_Encapsulation;

public class Student1 {
    // attribute
    public int id;
    public int age;
    public String name;
    public int nos;     //number of subject ->nos



    //default constructor// attribute. ->garbage
    public Student1(){
        System.out.println("Student Default constructor called");
    }

    //parametrized constructor
    public Student1(int id, int age, String name, int nos){
        System.out.println("Student parametrized constructor called");
        this.id= id;
        this.age= age;
        this.name= name;
        this.nos= nos;


    }

    // copy constructor
    public Student1(Lec17_CLASSandOBJECT.Student srcobj){ //srcobj -> A
        System.out.println("Student copy constructor called");
        this.id= srcobj.id;
        this.age= srcobj.age;
        this.name= srcobj.name;
        this.nos= srcobj.nos;


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
