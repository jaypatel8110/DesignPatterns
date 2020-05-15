package com.designpatterns.Factory;

public class Test {
    public static void main(String[] args) {
        System.out.println(CarFactory.BuildCar(CarType.SMALL));
        System.out.println(CarFactory.BuildCar(CarType.SEDAN));
        System.out.println(CarFactory.BuildCar(CarType.LUXURY));
        CarFactory.BuildCar(CarType.SMALL);
    }
}
