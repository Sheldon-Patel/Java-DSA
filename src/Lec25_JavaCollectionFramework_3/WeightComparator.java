package Lec25_JavaCollectionFramework_3;

import java.util.Comparator;

public class WeightComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
//         return o1.weight-o2.weight;
        return Integer.compare(o1.weight,o2.weight);


         // each int,string,double etc has their own compare methods
    }
}
