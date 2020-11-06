package com.reduction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex4SkipF {
    public static void main(String[] args) {

        List<String> strings=new ArrayList<String>();
        strings.add("bala");
        strings.add("krish");
        strings.add("das");
        strings.add("bgn");
        strings.add("ggd");

        //skip funcrion
       Stream<String> sk= strings.stream();
       sk= sk.skip(3);
       sk.forEach(System.out::println);
    }
}
