package com.skc.parallel_stream;

import com.skc.stream.api.Employee;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamUse {

    public static void main(String... strings){
        long start = 0;
        long end = 0;

        /*start = System.currentTimeMillis();
        IntStream.range(1, 100).forEach(System.out::println);
        end = System.currentTimeMillis();

        System.out.println("Plain stream took time : "+(end-start));

        start = System.currentTimeMillis();
        IntStream.range(1,100).parallel().forEach(System.out::println);
        end = System.currentTimeMillis();

        System.out.println("Parallel stream took time : " + (end-start));*/

        IntStream.range(1,10).forEach(x->{
            System.out.println("Thread : " + Thread.currentThread().getName() + " : " + x);
        });

        IntStream.range(1,10).parallel().forEach(x->{
            System.out.println("Thread : " + Thread.currentThread().getName() + " : " + x);
        });

        List<Employee> employees = EmployeeDatabase.getEmployees();

        start = System.currentTimeMillis();
        double v = employees.stream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("Normal stream execution time : " + (end-start) + " Average Salary : " + v);

        start = System.currentTimeMillis();
        double v1 = employees.stream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("Parallel stream execution time : " + (end-start)+ " Average Salary : " + v);
    }
}
