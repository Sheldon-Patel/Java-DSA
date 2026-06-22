package Lec18_Encapsulation;

public class App1 {
    public static void main(String[] args) throws Exception {
        // default ctor
//        Student A = new Student();
//        A.id = 1;
//        A.age = 14;
//        A.name = "Rahul";
//        A.nos = 5;
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        A.bunk();
//        A.sleep();
//        A.study();

        //parametrized contructor
        Student1 A1 = new Student1(1,13,"love",3);
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        A.bunk();
//        A.sleep();
//        A.study();

        //copy constructor
        Student1 B1 = new Student1(A1);
        System.out.println(B1.name);
        System.out.println(B1.age);
        System.out.println(B1.id);
        System.out.println(B1.nos);

        B1.study();


    }
}

