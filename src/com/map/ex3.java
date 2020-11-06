package com.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ex3 {

    public static void main(String[] args) {

        List<Emp> emps=new ArrayList<>();
        emps.add(new Emp(1,"bala",2000));
        emps.add(new Emp(2,"krish",8300));
        emps.add(new Emp(3,"bala",288000));
        emps.add(new Emp(4,"krish",8300));
        emps.add(new Emp(5,"bala",200880));
        emps.add(new Emp(6,"krish",30880));
       List<Double> emps1= emps.stream().map(n ->n.getSal()*3).collect(Collectors.toList());
        System.out.println(emps1);
    }
}
