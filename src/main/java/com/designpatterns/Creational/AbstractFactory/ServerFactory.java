package com.designpatterns.Creational.AbstractFactory;

import com.designpatterns.Creational.Factory.Computer;
import com.designpatterns.Creational.Factory.Server;

import java.util.Optional;

public class ServerFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }


    @Override
    public Optional<Computer> createComputer() {
        return Optional.of(new Server(ram,hdd,cpu));
    }
}