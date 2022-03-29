package com.springboot.springbootpractice2.domain;

import lombok.AllArgsConstructor;
import lombok.Value;

@AllArgsConstructor(staticName = "of")
@Value
public class Student {
    String name;
    Integer age;
    Grade grade;

    public enum Grade {
        A, B, C, D, E, F
    }

}


