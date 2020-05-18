
package com.designpatterns.Creational.Builder;

public class ComputerSingleClass {

    //required parameters
    private String HDD;
    private String RAM;

    //optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    private ComputerSingleClass(ComputerSingleClass builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    public ComputerSingleClass(String hdd, String ram) {
        this.HDD = hdd;
        this.RAM = ram;
    }

    public ComputerSingleClass graphicsCardEnabled(Boolean graphicsCardEnabled) {
        this.isGraphicsCardEnabled = graphicsCardEnabled;
        return this;

    }

    public ComputerSingleClass bluetoothEnabled(Boolean BluetoothEnabled) {
        this.isBluetoothEnabled = BluetoothEnabled;
        return this;
    }

    public ComputerSingleClass Build() {
        return new ComputerSingleClass(this);
    }

    @Override
    public String toString() {
        return "ComputerSingleClass {" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }

}


