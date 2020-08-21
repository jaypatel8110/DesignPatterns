package com.designpatterns.Java8DesignPatterns.Comparator.Model;

import java.awt.*;

public class Circle {

    private static int counter;
    private Color color;

    public Circle(Color color) {
        this.color=color;
    }

    public Circle() {

    }

    @Override
    public String toString() {
        ++counter;

        return "Called " + counter + "\tColor = " + color + "\n";
    }
}
