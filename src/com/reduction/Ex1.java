package com.reduction;

import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {

        int num[]={1,2,3,4,5,6,7,8,9,10};
        //sum operation
        int s= Arrays.stream(num).reduce(0,(a,b)->a+b);
        int s1= Arrays.stream(num).reduce(0,Integer::sum);
        System.out.println(s);
        System.out.println(s1);

        int s2=Arrays.stream(num).reduce(0,(a,b)->a-b);
        System.out.println(s2);

        int s3=Arrays.stream(num).reduce(0,(a,b)->a*b);
        System.out.println(s3);

        int s4=Arrays.stream(num).reduce(0,(a,b)->a/b);
        System.out.println(s4);
    }
}
