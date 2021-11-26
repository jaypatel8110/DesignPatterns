package com.designpatterns.Behavioral.Mediator.FlightExample;

public interface IATCMediator {


    void registerRunway(Runway runway);

    void registerFlight(Flight flight);

    boolean isLandingOk();

    void setLandingStatus(boolean status);
}
