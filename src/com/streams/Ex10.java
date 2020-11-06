package com.streams;

import java.util.ArrayList;
import java.util.List;

public class Ex10 {

    public static void main(String[] args) {

        List<Mobile> mobiles=new ArrayList<>();
        mobiles.add(new Mobile(1,"bala",1000));
        mobiles.add(new Mobile(1,"bala",0000));
        mobiles.add(new Mobile(1,"bala",3453));
        mobiles.add(new Mobile(1,"bala",42535));
        mobiles.add(new Mobile(1,"bala",1232442));
        mobiles.add(new Mobile(1,"bala",44));

      Double list=  mobiles.stream().map(Mobile::getAmount).min((a,b)->a.compareTo(b)).get();
        System.out.println(list);

      Double list1= mobiles.stream().map(Mobile::getAmount).max((a,b)->a.compareTo(b)).get();
        System.out.println(list1);
    }
}
