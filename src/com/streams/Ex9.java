package com.streams;

import java.util.ArrayList;
import java.util.List;

public class Ex9 {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(12311);
        list.add(00);
        list.add(23112);
        list.add(3333);
        list.add(768);

        Integer i=  list.stream().min((a,b)->a.compareTo(b)).get();
        System.out.println(i);

        Integer i1=  list.stream().min((a,b)->-a.compareTo(b)).get();
        System.out.println(i1);

        Integer s= list.stream().max((a,b)-> a.compareTo(b)).get();
        System.out.println(s);

        Integer s1= list.stream().max((a,b)-> -a.compareTo(b)).get();
        System.out.println(s1);


    }
}
