package PersonTypes;

import FlightClasses.Flight;
import Person.Person;

public class Passenger extends Person {

    private String name;
    private int numberOfBags;
    private double bagaggeWeight;
    private FlightClasses.Flight flight;

    public Passenger(String name, int numberOfBags, double baggageWeight) {
        super(name);
        this.numberOfBags = numberOfBags;
        this.bagaggeWeight = baggageWeight;
        this.flight = null;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    public double getBaggageWeight(){
        return this.bagaggeWeight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }
}
