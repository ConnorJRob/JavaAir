import PersonTypes.Airline.CabinCrewMember;
import PersonTypes.Airline.Pilot;
import PersonTypes.Passenger;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> bookedPassengers;
    private Plane plane;
    private String flightNumber;
    private String DestinationAirport;
    private String DepartureAirport;
    private String DepartureTime;

    public Flight(Plane plane, String flightNumber, String destinationAirport, String departureAirport, String departureTime) {
        this.pilots = new ArrayList<>();
        this.cabinCrewMembers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        DestinationAirport = destinationAirport;
        DepartureAirport = departureAirport;
        DepartureTime = departureTime;
        this.bookedPassengers = new ArrayList<>();
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public ArrayList<Passenger> getBookedPassengers() {
        return bookedPassengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestinationAirport() {
        return DestinationAirport;
    }

    public String getDepartureAirport() {
        return DepartureAirport;
    }

    public String getDepartureTime() {
        return DepartureTime;
    }

    public void assignPilot(Pilot pilot) {
        pilots.add(pilot);
    }

    public void assignCabinCrew(CabinCrewMember cabinCrewMember) {
        cabinCrewMembers.add(cabinCrewMember);
    }

    public void bookPassenger(Passenger passenger) {
        bookedPassengers.add(passenger);
    }
}
