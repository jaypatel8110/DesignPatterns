package com.designpatterns.Java8DesignPatterns.Comparator.Factory;

import com.designpatterns.Java8DesignPatterns.Comparator.Model.Circle;

import java.awt.*;
import java.util.List;

public class PlayWithTheFactory {


    public static void main(String[] args) {

        Factory<Circle> factory1= Factory.createFactory(Circle::new, Color.BLACK);
        Factory<Circle> factory2= Factory.createFactory(() -> new Circle());

        Circle circle= factory1.newInstance();
        List c2=factory1.create5();

        System.out.println(" Circle "+circle);
    }
}
