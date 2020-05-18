package com.designpatterns.Creational.Factory;

import java.util.Optional;

public class ComputerTestFactory {
    public static void main(String[] args) {
        Optional<Computer> pcClass= ComputerFactory.getComputer("PC","2 GB","500 GB","2.4 GHz");
        System.out.println(pcClass.isPresent()?pcClass.get():pcClass.isPresent());

        Optional<Computer> pcObject= ComputerFactory.getComputer("PC","2 GB","500 GB","2.4 GHz");
        System.out.println(pcObject);

        Optional<Computer> server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
        System.out.println(server);

        Optional<Computer> nullcheck = ComputerFactory.getComputer("null","16 GB","1 TB","2.9 GHz");
        System.out.println(nullcheck);
    }
}

