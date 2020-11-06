package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex4 {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(35311);
        list.add(14551);
        list.add(1165);
        list.add(33311);
        list.add(33311);
        list.add(165531);
        list.add(34511);
        list.add(311);


        //List<Integer> l=list.stream().sorted().collect(Collectors.toList());
        List<Integer> l=list.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("Ascending order-default by comparable");
        System.out.println(l);

        System.out.println("descending order-comparator");
       List<Integer> l1= list.stream().sorted((a,b)->((a<b)?1:(a>b)?-1:0)).collect(Collectors.toList());
        System.out.println(l1);

        List<Integer> l2=list.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());

        System.out.println(l2);




    }
}
