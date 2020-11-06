package com.filters;

import java.util.Arrays;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {

        List<Emp> emps= Arrays.asList(
                new Emp(1,"bala",1000),
                new Emp(2,"krishnan",2000),
                new Emp(3,"saha",3000),
                new Emp(4,"sanjay",4000));

     emps.stream().filter(e->e.getSal()>2000 && e.getName().endsWith("a")).forEach(System.out::println);


    }
}
