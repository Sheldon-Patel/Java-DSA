package Lec25_JavaCollectionFramework_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String [] args){

    List<Student> students = new ArrayList<>();

    students.add(new Student(19,"Vipul",68));
    students.add(new Student(23,"love",87));
    students.add(new Student(23,"Ankit",55));
    students.add(new Student(7,"Billu",13));

        System.out.println(students);

        Collections.sort(students, new WeightComparator());
        // WeightComparator class was made in other file and its obj was made here and used

//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                 return o1.weight - o2.weight;
//            }
//        });

        Collections.sort(students,(o1,o2) -> o1.weight - o2.weight );
//        (a,b) -> b-a;
//        the above big collections.sort in this small lambda expresion


        System.out.println(students);






//        List<Integer> list = new ArrayList<>();
//         list.add(15);
//         list.add(8);
//         list.add(2);
//         list.add(90);
//        System.out.println(list);
//
//        Collections.sort(list);
//        System.out.println(list);

    }
}
