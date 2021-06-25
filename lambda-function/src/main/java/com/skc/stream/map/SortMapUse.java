package com.skc.stream.map;

import com.skc.stream.api.Employee;

import java.util.*;


public class SortMapUse {
    public static void main(String [] strings){
        Map<String, Integer> map = new HashMap<>();

        map.put("eight", 8);
        map.put("four", 4);
        map.put("ten", 10);
        map.put("two", 2);

        Map<Employee, Integer> employeeMap = new TreeMap<>((a, b)-> (int) (a.getSalary()-b.getSalary()));

        employeeMap.put(new Employee(176, "Roshan", "IT", 600000), 60);
        employeeMap.put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
        employeeMap.put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
        employeeMap.put(new Employee(624, "Sourav", "CORE", 400000), 40);
        employeeMap.put(new Employee(176, "Prakash", "SOCIAL", 1200000), 120);
        System.out.println(employeeMap);

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        /*Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });*/

        //Collections.sort(entries, (a,b)->a.getKey().compareTo(b.getKey()));

       /* for (Map.Entry<String, Integer> entry: entries){
            System.out.println(entry.getKey());
        }*/

        //map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        //map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName).reversed())).forEach(System.out::println);
    }
}
