package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex8 {

    public static void main(String[] args) {

        List<Mobile> mobiles=new ArrayList<>();
        mobiles.add(new Mobile(1,"bala",1000));
        mobiles.add(new Mobile(2,"sachin",392020));
        mobiles.add(new Mobile(3,"abb",223322));
        mobiles.add(new Mobile(4,"anjay",454));
        mobiles.add(new Mobile(5,"ahsisss",9824));

        List<Integer> al=mobiles.stream().map(Mobile::getId).sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
        System.out.println(al);

        List<String> a2=mobiles.stream().map(Mobile::getName).sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
        System.out.println(a2);

        List<Double> a3= mobiles.stream().map(Mobile::getAmount).sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
        System.out.println(a3);

        Comparator<String> c=(a,b)->{
            int p=a.length();
            int q=b.length();
            if(p<q) return -1;
            else if(p>q) return 1;
            else return a.compareTo(b);
        };

        List<String> a4=
                mobiles.stream().map(Mobile::getName).sorted(c).collect(Collectors.toList());
        System.out.println(a4);


        List<Integer> a5=
                mobiles.stream().map(Mobile::getId).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(a5);
    }
}
