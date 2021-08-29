import Enums.PlaneTypes;
import Enums.Rank;
import FlightClasses.Flight;
import FlightClasses.FlightManager;
import FlightClasses.Plane;
import PersonTypes.Airline.CabinCrewMember;
import PersonTypes.Airline.Pilot;
import PersonTypes.Passenger;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Pilot pilot1; Pilot pilot2;
    ArrayList<Pilot> pilots;
    CabinCrewMember cabinCrewMember1; CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3; CabinCrewMember cabinCrewMember4;
    Plane plane;
    Passenger passenger1; Passenger passenger2; Passenger passenger3; Passenger passenger4; Passenger passenger5;
    Passenger passenger6; Passenger passenger7; Passenger passenger8; Passenger passenger9; Passenger passenger10;
    Passenger passenger11; Passenger passenger12; Passenger passenger13; Passenger passenger14; Passenger passenger15;
    Date departureDate;

    @Before
    public void before(){
        plane = new Plane(PlaneTypes.BOEING747);

        pilot1 = new Pilot("Connor", Rank.CAPTAIN, "AB123456");
        pilot2 = new Pilot("Lewis", Rank.FIRSTOFFICER, "CD123456");

        cabinCrewMember1 = new CabinCrewMember("Erin", Rank.PURSER);
        cabinCrewMember2 = new CabinCrewMember("Lara", Rank.FLIGHTATTENDANT);
        cabinCrewMember3 = new CabinCrewMember("Bella", Rank.FLIGHTATTENDANT);
        cabinCrewMember4 = new CabinCrewMember("Oscar", Rank.FLIGHTATTENDANT);

        passenger1 = new Passenger("Alpha", 2, 98); passenger2 = new Passenger("Bravo", 2, 104);
        passenger3 = new Passenger("Charlie", 1, 152); passenger4 = new Passenger("Delta", 2, 67);
        passenger5 = new Passenger("Echo", 2, 189); passenger6 = new Passenger("Foxtrot", 2, 154);
        passenger7 = new Passenger("Golf", 2,135); passenger8 = new Passenger("Hotel", 2, 90);
        passenger9 = new Passenger("India", 3, 210); passenger10 = new Passenger("Juliet", 2, 170);
        passenger11 = new Passenger("Kilo", 2, 180); passenger12 = new Passenger("Lima", 1, 122);
        passenger13 = new Passenger("Mike", 1, 170); passenger14 = new Passenger("November", 2, 175);
        passenger15 = new Passenger("Oscar", 2, 190);

        departureDate = new Date(2021, Calendar.AUGUST, 16, 12, 0, 0);
        flight = new Flight(plane, "JAV245", "ROM123", "EDI123", departureDate);
        flight.assignPilot(pilot1); flight.assignPilot(pilot2);
        flight.assignCabinCrew(cabinCrewMember1); flight.assignCabinCrew(cabinCrewMember2); flight.assignCabinCrew(cabinCrewMember3); flight.assignCabinCrew(cabinCrewMember4);
        flight.bookPassenger(passenger1); flight.bookPassenger(passenger2); flight.bookPassenger(passenger3); flight.bookPassenger(passenger4); flight.bookPassenger(passenger5);
        flight.bookPassenger(passenger6); flight.bookPassenger(passenger7); flight.bookPassenger(passenger8); flight.bookPassenger(passenger9); flight.bookPassenger(passenger10);
        flight.bookPassenger(passenger11); flight.bookPassenger(passenger12); flight.bookPassenger(passenger13); flight.bookPassenger(passenger14); flight.bookPassenger(passenger15);

        flightManager = new FlightManager(flight);
    }

    @Test
    public void flightManagerHasFlight(){
        assertEquals(flight, flightManager.getFlight());
    }

    @Test
    public void flightManagerCanCalculateIndividualBaggageAllowance(){
        assertEquals(265.95, flightManager.calculateIndividualBaggageAllowance(),0.1);
    }

    @Test
    public void flightManagerCanCalculateTotalCurrentBaggageWeight(){
        assertEquals(2206, flightManager.CalculateTotalCurrentBaggageWeight(), 0.1);
    }

    @Test
    public void flightManagerCanCalculateRemainingBaggageAllowance(){
        assertEquals(97871, flightManager.calculateRemainingBaggageAllowance(), 0.1);
    }

}
