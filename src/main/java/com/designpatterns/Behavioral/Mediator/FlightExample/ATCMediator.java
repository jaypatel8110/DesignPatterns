package com.designpatterns.Behavioral.Mediator.FlightExample;

public class ATCMediator implements IATCMediator {
    private Flight flight;
    private Runway runway;
    public Boolean avalable;

    @Override
    public void registerRunway(Runway runway) {
     this.runway=runway;
    }

    @Override
    public void registerFlight(Flight flight) {
    this.flight=flight;
    }

    @Override
    public boolean isLandingOk() {
        return avalable;
    }

    @Override
    public void setLandingStatus(boolean status) {
        avalable = status;
    }
}
