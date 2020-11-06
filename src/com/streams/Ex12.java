package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Ex12 {

    public static void main(String[] args) {

        List<Mobile> mobiles=new ArrayList<>();
        mobiles.add(new Mobile(1,"bala",1000));
        mobiles.add(new Mobile(1,"bala",0000));
        mobiles.add(new Mobile(1,"bala",3453));
        mobiles.add(new Mobile(1,"bala",42535));
        mobiles.add(new Mobile(1,"bala",1232442));
        mobiles.add(new Mobile(1,"bala",44));


        Consumer<Double> c=(i->{
            System.out.println(i*i);
        });

        mobiles.stream().map(Mobile::getAmount).forEach(c);

    }
}
