package Lec23_JavaCollectionFramework_1;

import javax.naming.InsufficientResourcesException;
import java.util.*;

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

        //addAll
        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list2.add(20);

        list.addAll(list2);
        System.out.println(list);

        list.removeAll(list2);
        System.out.println(list);

        System.out.println(list.size());

        System.out.println("printing list2:"+list2);
        list2.clear();
        System.out.println(list2.size());
//        System.out.println(list2);

        // i want to traverse list using iterator
        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.println("Elements: "+ iterator.next());
        }


        List<Integer> list3 = new ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(14);
        System.out.println(list3.get(0));

        System.out.println("before set: "+list3);
        list3.set(0, 100);
        System.out.println("After set: "+list3);



//        Collection<Integer> collection =  new ArrayList<>();

        //toArray
        Object [] arr = list3.toArray();
        for(Object obj : arr){
            System.out.println(obj);
        }

        //contains
        System.out.println(list3.contains(100));


        list.add(12);
        list.add(6);
        System.out.println("printing entier list: "+ list);

        // sort an arraylist
        Collections.sort(list);
        System.out.println("printing entier list: "+ list);


        ArrayList<Integer>newList = (ArrayList<Integer>) list.clone();
        // (ArrayList<Integer>) is added for typecasting
        System.out.println(newList);

        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);
    }
}
