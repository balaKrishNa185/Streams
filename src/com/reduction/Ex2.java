package com.reduction;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {

        int num[]={1,2,3,4,5,6,7,8,9,10};
  //max operation
     int s=  Arrays.stream(num).reduce(0,(a,b)->a>b ? a:b);
        System.out.println(s);

       int s1= Arrays.stream(num).reduce(0,Integer::max);
        System.out.println(s1);

        //min operation
      int s2=  Arrays.stream(num).reduce(0,(a,b)->a<b ?a:b);
        System.out.println(s2);

       int s3= Arrays.stream(num).reduce(0,Integer::min);
        System.out.println(s3);

        int a[]={23,13,6,5343,78,1,99,65,3333};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
