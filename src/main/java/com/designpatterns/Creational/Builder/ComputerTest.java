package com.designpatterns.Creational.Builder;

public class ComputerTest {
    public static void main(String[] args) {

        Computer computeroriginal= new Computer.ComputerBuilder("500 Gb","8 gb").Build();
        System.out.println(computeroriginal);


        ComputerSingleClass computer= new ComputerSingleClass("500 Gb","8 gb").Build();
        System.out.println(computer.toString());

        ComputerSingleClass computer2= new ComputerSingleClass("444444 Gb","844444444 gb").bluetoothEnabled(true).Build();
        System.out.println(computer2.toString());

    }
}
