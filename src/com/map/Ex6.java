package com.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Ex6 {

    public static void main(String[] args) {

        List<Student> students=new ArrayList<>();
        students.add(new Student("BALA",199));
        students.add(new Student("Krish",199));
        students.add(new Student("sanajy",10));
        students.add(new Student("arya",199));
        students.add(new Student("surya",199));
        students.add(new Student("saav",199));
        students.add(new Student("aamla",199));

//       List<Double>s1=  students.stream()
//                .filter(s->s.getName().startsWith("s") && s.getName().endsWith("y"))
//                .map(s->s.getMarks()*s.getMarks())
//                .collect(Collectors.toList());
//
//        System.out.println(s1);

        Optional<Double> list=  students.stream().map(Student::getMarks).reduce((a, b)->(a+b));

        System.out.println(list);
    }
}
