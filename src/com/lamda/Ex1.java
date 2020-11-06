package com.lamda;

public class Ex1 {

    public static void main(String[] args) {
        int add=2;
        Sum sum=()->{
            System.out.println("sum="+add);
        };
    sum.add();
    }
}
