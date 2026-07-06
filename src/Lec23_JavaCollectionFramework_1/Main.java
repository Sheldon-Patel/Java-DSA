package Lec23_JavaCollectionFramework_1;

import javax.naming.InsufficientResourcesException;
import java.util.*;

public class Main {
    static void main(String[] args) {
        // list or collection -> interface

        // ArrayList -> concrete class
//        ArrayList<Integer> list = new ArrayList<>();
//        List<Integer> list = new LinkedList<>();
//        List<Integer> list = new Vector<>();
        List<Integer> list = new Stack<>();


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
        List<Integer> list2 = new Stack<>();
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


        List<Integer> list3 = new Stack<>();
//        List<Integer> list3 = new ArrayList<>();
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
        System.out.println("sorting");
        Collections.sort(list);
        System.out.println("printing entier list: "+ list);


//        LinkedList<Integer>newList = (LinkedList<Integer>) list.clone();
        // (ArrayList<Integer>) is added for typecasting
//        System.out.println(newList);

        // ensureCapacity
//        ArrayList<Integer> marks = new ArrayList<>();
//        marks.ensureCapacity(100);

        // isEmpty
//        System.out.println(marks.isEmpty());

        list.add(30);
        list.add(24);
        list.add(30);


        System.out.println("printing original list"+ list);

        //lastIndexOf
        System.out.println(list.lastIndexOf(30));

        //indexOf
        System.out.println(list.indexOf(40));

        // addFirst and addLast
        list.remove(3);
        list.remove(3);
        list.remove(3);
        list.remove(3);
        System.out.println("printing original list"+ list);
//        list.addFirst(101);

//        LinkedList<Integer> ll = new LinkedList<>();
//        ll.add(10);
//        System.out.println(ll);
//        ll.addFirst(1);
//        System.out.println(ll);
//        ll.addLast(101);
//        System.out.println(ll);
//
//        System.out.println(ll.getFirst());
//
//        System.out.println(ll.getLast());
//
//        System.out.println(ll.peek());
//
//        System.out.println("before :"+ll);
//        System.out.println("polling" +ll.poll());
//        System.out.println("after :"+ll);
//
//        ll.offer(40);
//        System.out.println(ll);




//        ll.removeFirst();
//        System.out.println(ll);
//
//        ll.removeLast();
//        System.out.println(ll);

        Stack<Integer> st = new Stack<>();
        st.push(10);
        System.out.println(st);

        st.push(20);
        System.out.println(st);

        st.push(30);
        System.out.println(st);

        st.pop();
        System.out.println(st);

        System.out.println(st.peek());



    }
}
