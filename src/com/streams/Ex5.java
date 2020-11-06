package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex5 {


    public static void main(String[] args) {

        List<String> al=new ArrayList<>();
        al.add("bala");
        al.add("krishnan");
        al.add("ajay");
        al.add("saurav");
        al.add("ashsis");

      List<String> a1=   al.stream().sorted().collect(Collectors.toList());
        System.out.println("ascending order");
        System.out.println(a1);

        List<String> c= al.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
        System.out.println(c);
        System.out.println("-------------------------");
        List<String> d=al.stream().sorted((a,b)->-a.compareTo(b)).collect(Collectors.toList());
        System.out.println(d);
    }
}
