package com.filters;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex6 {

    public static void main(String[] args) {

        List<String> as= Arrays.asList("usa","india","uk","america");
       String s= as.stream()
                .map(e->e.toUpperCase())
                .collect(Collectors.joining(","));

        System.out.println(s);

    }
}
