package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex11 {

    public static void main(String[] args) {

        List<Integer> al= Arrays.asList(1,3,212,35,12,44);

        Consumer<Integer> c=(i->{
            System.out.println("square of"+i+"="+i*i);
        });
        al.stream().forEach(c);
    }
}
