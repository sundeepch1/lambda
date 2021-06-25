package com.skc.pre.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateUse {

    public static void main(String... strings) {
       /*Predicate<Integer> predicate = (t) -> t % 2 == 0;

        System.out.println(predicate.test(3));*/

        List<Integer> list = Arrays.asList(1,2,3,4,5);

         list.stream().filter((t) -> t % 2 == 0).forEach(System.out::println);
    }
}
