import Enums.PlaneTypes;
import Enums.Rank;
import People.PilotTest;
import PersonTypes.Airline.CabinCrewMember;
import PersonTypes.Airline.Pilot;
import PersonTypes.Passenger;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot1; Pilot pilot2;
    ArrayList<Pilot> pilots;
    CabinCrewMember cabinCrewMember1; CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3; CabinCrewMember cabinCrewMember4;
    Plane plane;
    Passenger passenger1; Passenger passenger2; Passenger passenger3; Passenger passenger4; Passenger passenger5;
    Passenger passenger6; Passenger passenger7; Passenger passenger8; Passenger passenger9; Passenger passenger10;
    Passenger passenger11; Passenger passenger12; Passenger passenger13; Passenger passenger14; Passenger passenger15;

    @Before
    public void before(){
        plane = new Plane(PlaneTypes.BOEING767);

        pilot1 = new Pilot("Connor", Rank.CAPTAIN, "AB123456");
        pilot2 = new Pilot("Lewis", Rank.FIRSTOFFICER, "CD123456");

        cabinCrewMember1 = new CabinCrewMember("Erin", Rank.PURSER);
        cabinCrewMember2 = new CabinCrewMember("Lara", Rank.FLIGHTATTENDANT);
        cabinCrewMember3 = new CabinCrewMember("Bella", Rank.FLIGHTATTENDANT);
        cabinCrewMember4 = new CabinCrewMember("Oscar", Rank.FLIGHTATTENDANT);

        passenger1 = new Passenger("Alpha", 2); passenger2 = new Passenger("Bravo", 2);
        passenger1 = new Passenger("Charlie", 1); passenger2 = new Passenger("Delta", 2);
        passenger1 = new Passenger("Echo", 2); passenger2 = new Passenger("Foxtrot", 2);
        passenger1 = new Passenger("Golf", 2); passenger2 = new Passenger("Hotel", 2);
        passenger1 = new Passenger("India", 3); passenger2 = new Passenger("Juliet", 2);
        passenger1 = new Passenger("Kilo", 2); passenger2 = new Passenger("Lima", 1);
        passenger1 = new Passenger("Mike", 1); passenger2 = new Passenger("November", 2);
        passenger1 = new Passenger("Oscar", 2);

//        cabinCrewMembers.add(cabinCrewMember1); cabinCrewMembers.add(cabinCrewMember2);
//        cabinCrewMembers.add(cabinCrewMember3); cabinCrewMembers.add(cabinCrewMember4);

        flight = new Flight(plane, "JAV245", "ROM123", "EDI123", "12:00");

    }

    @Test
    public void flightCanBeAssignedPilots(){
        flight.assignPilot(pilot1);
        flight.assignPilot(pilot2);
        assertEquals(2, flight.getPilots().size());
    }

    @Test
    public void flightCanBeAssignedCabinCrew(){
        flight.assignCabinCrew(cabinCrewMember1);
        flight.assignCabinCrew(cabinCrewMember2);
        flight.assignCabinCrew(cabinCrewMember3);
        flight.assignCabinCrew(cabinCrewMember4);
        assertEquals(4, flight.getCabinCrewMembers().size());
    }

    @Test
    public void flightStartsWith0Passengers(){
        assertEquals(0, flight.getBookedPassengers().size());
    }

    @Test
    public void flightHasAssignedPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void flightHasNumber(){
        assertEquals("JAV245", flight.getFlightNumber());
    }

    @Test
    public void flightHasDestination(){
        assertEquals("ROM123", flight.getDestinationAirport());
    }

    @Test
    public void flightHasDepartureAirport(){
        assertEquals("EDI123", flight.getDepartureAirport());
    }

    @Test
    public void flightHasDepartureTime(){
        assertEquals("12:00", flight.getDepartureTime());
    }

    @Test
    public void canBookAPassengerOntoFlight(){
        flight.bookPassenger(passenger10);
        assertEquals(passenger10, flight.getBookedPassengers().get(0));
    }

    @Test
    public void canReturnNumberOfPassengersBooked(){
        flight.bookPassenger(passenger1); flight.bookPassenger(passenger2); flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger4); flight.bookPassenger(passenger5); flight.bookPassenger(passenger6);
        assertEquals(6, flight.getBookedPassengers().size());
    }

}
