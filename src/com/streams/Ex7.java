package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex7 {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("bala krishnan");
        list.add("sanjay");
        list.add("sathya narayanana");
        list.add("mahendra singh dhoni");
        list.add("virat kohli");

        Comparator<String> cl= (a,b)->{
            int p=a.length();
            int q=b.length();
            if(p<q) return -1;
            else if(q<p) return 1;
            else return a.compareTo(b);
        };
       List<String> al= list.stream().sorted(cl).collect(Collectors.toList());
        System.out.println(al);
    }
}
