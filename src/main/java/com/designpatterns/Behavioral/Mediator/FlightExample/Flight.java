package com.designpatterns.Behavioral.Mediator.FlightExample;

public class Flight implements Command {

    private final IATCMediator atcMediator;

    public Flight(IATCMediator atcMediator) {
        this.atcMediator = atcMediator;
    }

    @Override
    public void land() {
        if (atcMediator.isLandingOk()) {
            System.out.println("Landed Successfully");
            atcMediator.setLandingStatus(false); // runway is occupied
        } else
            System.out.println("Waiting for landing");
    }

    public void getReadyToLand() {
        System.out.println("Landing Initiated");
    }

    public void parked(){
        System.out.println("Flight is parked");
        atcMediator.setLandingStatus(true); // runway is now available
    }

}
