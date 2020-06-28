package com.designpatterns.Behavioral.ChainofResponsibility;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);

}
