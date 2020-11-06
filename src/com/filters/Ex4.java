package com.filters;

import java.util.Arrays;
import java.util.List;

public class Ex4 {

    public static void main(String[] args) {

        List<String> str= Arrays.asList("aaa","","asa","a","tdff");
       Long s= str.stream().filter(x->x.isEmpty()).count();
        System.out.println(s);
    }
}
