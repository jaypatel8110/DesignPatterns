package com.designpatterns.Structual.Adapter;
//https://www.journaldev.com/1487/adapter-design-pattern-java

public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }
}
