package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex6 {

    public static void main(String[] args) {

        List<Mobile> mobiles=new ArrayList<>();
        mobiles.add(new Mobile(1,"Asus",100000));
        mobiles.add(new Mobile(2,"Redmi",20000));
        mobiles.add(new Mobile(4,"Lava",150000));
        mobiles.add(new Mobile(3,"Honour",3400));

       mobiles.stream().map(Mobile::getId).sorted().forEach(System.out::println);


       List<String> s=mobiles.stream().map(Mobile::getName).sorted((c,d)->(c.compareTo(d))).collect(Collectors.toList());
        System.out.println(s);

       List<Double> doubles=   mobiles.stream().map(Mobile::getAmount).sorted((e,f)->(-e.compareTo(f))).collect(Collectors.toList());
        System.out.println(doubles);
    }
}
