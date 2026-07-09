package Lec25_JavaCollectionFramework_3;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {
    public static void main(String[] args){

        Map<String,String> mapping = new HashMap<>();

        //insertion
        mapping.put("in","India");
        mapping.put("en","England");
        mapping.put("us","United States");

        System.out.println(mapping  );


    }
}
