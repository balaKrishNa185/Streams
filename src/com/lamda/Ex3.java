package com.lamda;

public class Ex3 {
    public static void main(String[] args) {

        Sayable s1=(name)->
        {
          return "hi "+name;
        };
      String s2= s1.say("bala");
        System.out.println(s2);

        Sayable s3=(name)->{
          return "helo "+name;
        };

        System.out.println(s3.say("ajay"));
    }
}
