package com.designpatterns.Creational.AbstractFactory;

import com.designpatterns.Creational.Factory.Computer;
import com.designpatterns.Creational.Factory.PC;

import java.util.Optional;

public class PCFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public Optional<Computer> createComputer() {
        return Optional.of(new PC(ram,hdd,cpu)); // Note We are Using Pc from Factory Pattern
    }
}
