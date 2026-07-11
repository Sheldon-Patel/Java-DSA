package Lec25_JavaCollectionFramework_3;

import java.util.Comparator;

public class ReverseCmp implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return 0 - Integer.compare(o1,o2);
//        return  - Integer.compare(o1,o2);
        //0- will make negative num to positive
        // it even work with only -
    }
}
