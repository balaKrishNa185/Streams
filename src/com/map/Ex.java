package com.map;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class Ex {

    public static void main(String[] args) {

        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);

    OptionalInt value=list.stream().mapToInt(Integer::intValue).max();


    boolean v=value.isPresent();
        System.out.println(value);
    }
}
