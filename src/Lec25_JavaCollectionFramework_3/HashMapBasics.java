package Lec25_JavaCollectionFramework_3;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {
    public static void main(String[] args){

        Map<String,String> mapping = new HashMap<>();

        //insertion
        mapping.put("in","India");
//        mapping.put("in","India2");
        mapping.put("en","England");
        mapping.put("us","United States");

        System.out.println(mapping  );

        Map<String,String> table = new HashMap<>();
        table.put("br","Brazil");

        System.out.println("before"+table);
        table.putAll(mapping);
        System.out.println("after"+table);

        //deletion
        table.remove("en");
        System.out.println(table);

        System.out.println(table.get("br"));

        System.out.println(table.getOrDefault("us","NONE"));
        System.out.println(table.getOrDefault("usa","NONE"));


        System.out.println(table.containsKey("in"));

        System.out.println(table.containsValue("United States"));


//        table.putIfAbsent("is","India");
        table.putIfAbsent("is","India3");
        System.out.println(table);

//        System.out.println(table.size());
//        table.clear();
//        System.out.println(table.size());

    }
}
