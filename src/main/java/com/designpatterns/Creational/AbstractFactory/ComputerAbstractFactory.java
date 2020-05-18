package com.designpatterns.Creational.AbstractFactory;

import com.designpatterns.Creational.Factory.Computer;

import java.util.Optional;

public interface ComputerAbstractFactory {
    public Optional<Computer> createComputer();

}
