package com.designpatterns.Creational.PrototypePattern;

public class Album implements PrototypeCapable {

    /* https://howtodoinjava.com/design-patterns/creational/prototype-design-pattern-in-java/*/

    private String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Album clone() throws CloneNotSupportedException {
        System.out.println("Cloning Album object..");
        return (Album) super.clone();
    }

    @Override
    public String toString() {
        return "Album";
    }
}