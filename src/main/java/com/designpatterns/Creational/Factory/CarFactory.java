package com.designpatterns.Creational.Factory;

public class CarFactory {
    public static Car BuildCar(CarType model){
        Car car=null;
        switch (model){
            case SMALL:
                car=new SmallCar();
                break;
            case SEDAN:
                car = new SedanCar();
                break;

            case LUXURY:
                car = new LuxuryCar();
                break;

            default:
                // throw some exception
                break;
        }
        return car;
    }
}
