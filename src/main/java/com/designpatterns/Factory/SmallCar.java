package com.designpatterns.Factory;

public class SmallCar extends Car {

    SmallCar(){
        super(CarType.SMALL);
        construct();
    }

    @Override
    protected void construct() {

    }
}
