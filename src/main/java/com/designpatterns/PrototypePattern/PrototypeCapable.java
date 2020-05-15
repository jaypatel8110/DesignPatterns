package com.designpatterns.PrototypePattern;

public interface PrototypeCapable extends Cloneable {

        public PrototypeCapable clone() throws CloneNotSupportedException;
}
