package com.streams;

import java.util.Arrays;
import java.util.List;

public class Ex13 {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
      Integer[] i=  list.stream().toArray(Integer[]::new);

      for(Integer i1:i){
          System.out.println(i1);
      }


    }
}
