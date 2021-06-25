package com.skc.pre.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierUse {
    public static void main(String...strings){
        Supplier supplier = ()->new String("Sundeep");
        System.out.println(supplier.get());

        List<String> list = Arrays.asList();

        System.out.println(list.stream().findAny().orElseGet(()->new String("Sundeep")));
    }
}
