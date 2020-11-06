package com.streams;

import java.util.stream.Stream;

public class Ex14 {

    public static void main(String[] args) {
        Stream s=Stream.of(99,99,9999,999);

        s.forEach(System.out::println);

        Integer [] i={99,99,9999,999};
        Stream.of(i).forEach(System.out::println);
    }
}
