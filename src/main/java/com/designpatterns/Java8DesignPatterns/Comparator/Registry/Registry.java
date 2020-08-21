package com.designpatterns.Java8DesignPatterns.Comparator.Registry;

import com.designpatterns.Java8DesignPatterns.Comparator.Factory.Builder;
import com.designpatterns.Java8DesignPatterns.Comparator.Factory.Factory;
import com.designpatterns.Java8DesignPatterns.Comparator.Model.Rectangle;
import com.designpatterns.Java8DesignPatterns.Comparator.Model.Shape;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Registry {

    Factory<Shape> buildShapeFactory(String shape) {
        return null;
    }

    public static Registry createRegistry(Consumer<Builder<Rectangle>> consumer){

        Map<String,Factory<Rectangle>> map = new HashMap<>();
        Builder<Rectangle> builder =(label, factory) -> map.put(label,factory);
        consumer.accept(builder);
        return null;
    }
}
