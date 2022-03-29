package com.springboot.springbootpractice2.domain;

import lombok.Value;

@Value
public class Student {
    String name;
    Integer age;
    Grade grade;

    public enum Grade {
        A, B, C, D, E, F
    }

    public static Student of (String name, Integer age, Grade grade) {
        return new Student(name, age, grade);
    }
}


