package com.designpatterns.Creational.Factory;

public class SmallCar extends Car {

    SmallCar(){
        super(CarType.SMALL);
        construct();
    }

    @Override
    protected void construct() {

    }
}
