package com.designpatterns.Creational.AbstractFactory;

import com.designpatterns.Creational.Factory.Computer;

import java.util.Optional;

public class ComputerFactory {

    public static Optional<Computer> getComputer(ComputerAbstractFactory computerAbstractFactory) {
        return computerAbstractFactory.createComputer();
    }

}
