package com.skc.stream.sort;

import com.skc.stream.api.DataBase;
import com.skc.stream.api.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListUse {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(4);
        //Collections.sort(list);
        //Collections.reverse(list);

        //list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        List<Employee> employees = DataBase.getEmployees();
        /*Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                //return o1.getName().compareTo(o2.getName());
                return (int) (o1.getSalary()-o2.getSalary());
            }
        });

        Collections.sort(employees, (a, b) -> (int)(a.getSalary()-b.getSalary()));*/

        //employees.stream().sorted((a,b)->(int)(a.getSalary()-b.getSalary())).forEach(System.out::println);
        employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
    }

}
