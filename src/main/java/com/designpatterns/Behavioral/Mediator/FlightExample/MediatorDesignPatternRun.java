package com.designpatterns.Behavioral.Mediator.FlightExample;

public class MediatorDesignPatternRun {

    public static void main(String[] args) {

        IATCMediator atcMediator = new ATCMediator();
        Runway mainRunway = new Runway(atcMediator);

        Flight flightOne = new Flight(atcMediator);
        Flight flightTwo = new Flight(atcMediator);

        atcMediator.registerFlight(flightOne);
        atcMediator.registerRunway(mainRunway);

        flightOne.getReadyToLand();
        mainRunway.land();
        flightOne.land();
       // flightTwo.land();
        flightOne.parked();

    }
}
