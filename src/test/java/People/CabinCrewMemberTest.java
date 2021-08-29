package People;

import Enums.Rank;
import PersonTypes.Airline.CabinCrewMember;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;
    String message;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Elsa Rodriguez", Rank.FLIGHTATTENDANT);
    }

    @Test
    public void cabinCrewMemberHasName(){
        assertEquals("Elsa Rodriguez", cabinCrewMember.getName());
    }

    @Test
    public void  cabinCrewMemberHasRankTitle(){
        assertEquals("FlightClasses.Flight Attendant", cabinCrewMember.getRank().getRankTitle());
    }

    @Test
    public void cabinCrewCanRelayMessages(){
        message = "Please fasten your seatbelts";
        assertEquals("Please fasten your seatbelts", cabinCrewMember.relayMessageToPassengers(message));
    }
}
