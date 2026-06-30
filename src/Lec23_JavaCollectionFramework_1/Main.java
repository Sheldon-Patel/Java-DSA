package Lec23_JavaCollectionFramework_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    static void main(String[] args) {
        // list or collection -> interface

        // ArrayList -> concrete class
        ArrayList<Integer> list = new ArrayList<>();

        // add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);


//        List<Integer> list = new ArrayList<>();
//        Collection<Integer> collection =  new ArrayList<>();

    }
}
