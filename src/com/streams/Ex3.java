package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex3 {

    public static void main(String[] args) {

        List<Integer> marks= new ArrayList<>();
        marks.add(111);
        marks.add(231111111);
        marks.add(341);


       int nos= (int) marks.stream().filter(m->m>20).count();
        System.out.println(nos);


        List<Integer> sort=marks.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sort);
    }
}
