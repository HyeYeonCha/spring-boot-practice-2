package com.springboot.springbootpractice2.logic;

import java.util.List;

public interface Sort <T extends Comparable<T>> {
    public List<T> sort(List<T> list);
}
