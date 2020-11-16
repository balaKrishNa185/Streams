package com.filters;

import java.util.Arrays;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {

        List<String> as= Arrays.asList("adff","dff","dsffffffffffff","Df","","");

    Long a= as.stream()
                .filter(n->n.length()>1)
                .count();
        System.out.println(a);
    }
}
