package com.skc.pre.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerUse {

    public static void main(String ...strings){
        /*Consumer consumer = i ->
            System.out.println("Printing : " + i);

        consumer.accept(50);*/

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        list.forEach(i ->
                System.out.println("Printing : " + i));
    }
}
