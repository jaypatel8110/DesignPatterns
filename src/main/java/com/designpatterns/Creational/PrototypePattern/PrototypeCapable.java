package com.designpatterns.Creational.PrototypePattern;

public interface PrototypeCapable extends Cloneable {

        public PrototypeCapable clone() throws CloneNotSupportedException;
}
