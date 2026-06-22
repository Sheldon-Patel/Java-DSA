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
//        Student A = new Student(1,13,"love",3);
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        A.bunk();
//        A.sleep();
//        A.study();

        //copy constructor
//        Student B = new Student(A);
//        System.out.println(B.name);
//        System.out.println(B.age);
//        System.out.println(B.id);
//        System.out.println(B.nos);

//        B.study();


        //encapsulation
//        Student A = new Student(1,13,"love",3,"tina");
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//        System.out.println(A.gf);    // gives error because its private
//
//        A.bunk();
//        A.sleep();
//        A.study();
//        A.gfChatting();
//

        // perfect encapsulation
        Student A = new Student(1,13,"love",3,"tina");
//        System.out.println(A.name);  // it will not work because of private so made a public method to acces it
//        System.out.println(A.getName());
//        A.age=57;  //will give error because we needed to access with getter setter

        System.out.println(A.getAge());
        A.setAge(67);

        System.out.println(A.getAge());







//        A.bunk();
//        A.sleep();
//        A.study();



    }
}
