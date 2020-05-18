package com.designpatterns.Creational.AbstractFactory;

import com.designpatterns.Creational.Factory.Computer;

import java.util.Optional;

public class TestAbstractPattern {
    public static void main(String[] args) {
        Optional<Computer> pc= ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        System.out.println(pc.get());

    }
}
