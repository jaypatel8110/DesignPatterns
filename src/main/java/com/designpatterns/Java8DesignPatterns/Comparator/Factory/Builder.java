package com.designpatterns.Java8DesignPatterns.Comparator.Factory;

public interface Builder<T> {

    void register(String label, Factory<T> factory);
}
