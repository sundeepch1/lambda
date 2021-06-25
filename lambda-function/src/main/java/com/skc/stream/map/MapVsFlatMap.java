package com.skc.stream.map;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

    public static void main(String... strings){
        List<Customer> customers = EkartDataBase.getAll();

        List<String> list = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(list);

        //List<List<String>> phoneNumbers = customers.stream().map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());

        List<String> phoneNumbers = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());

        System.out.println(phoneNumbers);
    }
}
