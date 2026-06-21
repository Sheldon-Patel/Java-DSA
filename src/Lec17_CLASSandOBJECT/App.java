package Lec17_CLASSandOBJECT;

public class App {
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
        Student A = new Student(1,13,"love",3);
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        A.bunk();
//        A.sleep();
//        A.study();

        //copy constructor
        Student B = new Student(A);
        System.out.println(B.name);
        System.out.println(B.age);
        System.out.println(B.id);
        System.out.println(B.nos);

        B.study();


    }
}
