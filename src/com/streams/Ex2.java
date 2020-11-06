package com.streams;

import java.util.stream.Stream;

public class Ex2 {

    public static void main(String[] args) {

        Stream.of("ava","bala","sanajy")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
