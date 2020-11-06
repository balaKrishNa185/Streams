package com.lamda;

public class Ex2 {
    public static void main(String[] args) {
        int a=5;
        int b=5;

        Add add=(c,d)->
        {
            System.out.println("sum="+(c+d));
        };
        add.add(a,b);
    }
}
