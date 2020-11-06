package com.map;
import java.util.ArrayList;
import java.util.List;

public class Ex7 {

    public static void main(String[] args) {

        List<Person> people=new ArrayList<>();
        people.add(new Person("bala","tn",19));
        people.add(new Person("sanjay","tn",20));
        people.add(new Person("surya","tn",23));
        people.add(new Person("sathya","tn",24));
        people.add(new Person("saurav","tn",18));

     Person people1= people.stream()
                .filter(a->a.getName().startsWith("s")&& a.getAge()==18)
                .findAny()
                .orElse(null);
        System.out.println(people1);

    }
}
