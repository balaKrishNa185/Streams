package com.filters;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

    public static void main(String[] args) {

        List<Emp> emps= new ArrayList<>();
        emps.add(new Emp(1,"balaa",200));
        emps.add(new Emp(2,"krishnan",200));
        emps.add(new Emp(3,"dadafsf",200));
        emps.add(new Emp(4,"fgfgfdgdfbg",200));

       List<Emp> emps1= emps.stream().filter(f->f.getName().length()>6 && f.getName().length()<12).collect(Collectors.toList());
        System.out.println(emps1);
    }
}
