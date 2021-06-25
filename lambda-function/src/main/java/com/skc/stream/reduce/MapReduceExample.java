package com.skc.stream.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {

    public static void main(String... strings){
        List<Integer> numbers = Arrays.asList(3,7,8,1,5,9);

        int sum =0;
        //sum = numbers.stream().mapToInt(i->i).sum();
        //sum = numbers.stream().reduce(sum, (a,b)->a+b);
        Optional<Integer> s = numbers.stream().reduce(Integer::sum);
        //System.out.println("Sum : " + s.get());
        //System.out.println("Product : " + numbers.stream().reduce(1, (a,b)->a*b));
        //System.out.println("Conditional : " + numbers.stream().reduce(0, (a,b)->a>b?a:b));
        //System.out.println("Conditional : " + numbers.stream().reduce(Integer::max));

        //List<String> list = Arrays.asList("Sundeep", "Muna","Deepak");
        //System.out.println(list.stream().reduce((a,b)->a.length()>b.length()?a:b).get());

        double avgSalary= EmployeeDatabase.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i->i)
                .average().getAsDouble();

        double sumSalary= EmployeeDatabase.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i->i)
                .sum();

        System.out.println(sumSalary);
    }
}
