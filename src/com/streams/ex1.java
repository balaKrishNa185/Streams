package com.streams;

import java.util.stream.IntStream;

public class ex1 {
    public static void main(String[] args) {

//        IntStream
//                .range(1,11)
//                .skip(5)
//                .forEach(System.out::println);
        System.out.println(
        IntStream
                .range(1,5)
                .sum());
        //System.out.println();

    }
}
