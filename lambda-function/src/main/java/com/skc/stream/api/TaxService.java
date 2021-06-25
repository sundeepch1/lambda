package com.skc.stream.api;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

    public static List<Employee> evaluateTaxUsers(String input) {
        if (input.equalsIgnoreCase("tax")) {
            return DataBase.getEmployees().stream().filter(e -> e.getSalary() > 500000).collect(Collectors.toList());
        } else {
            return DataBase.getEmployees().stream().filter(e -> e.getSalary() <= 500000).collect(Collectors.toList());
        }

    }

    public static void main(String[] args) {
        System.out.println(evaluateTaxUsers("no tax"));
    }
}
