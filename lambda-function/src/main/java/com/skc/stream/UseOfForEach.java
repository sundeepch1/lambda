package com.skc.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseOfForEach {

    public static void main(String...strings){
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();

        list.add("Murrit");
        list.add("john");
        list.add("piter");
        list.add("marek");
        list.add("mac");
        //list.forEach(list1::add);

        list.stream().filter(a-> a.startsWith("m")).forEach(t->System.out.println(t));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "3");
        map.put(4, "d");

        /*map.forEach((key, value) -> System.out.println(key + " : " + value ));*/
        map.entrySet().stream().filter(a->a.getKey()%2==0).forEach(t -> System.out.println(t.getKey() + " : " + t.getValue()));
    }
}
