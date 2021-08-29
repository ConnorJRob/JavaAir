package People;

import Enums.Rank;
import PersonTypes.Airline.Pilot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Lewis Robertson", Rank.CAPTAIN, "AB123456");
    }

    @Test
    public void pilotHasName(){
        assertEquals("Lewis Robertson", pilot.getName());
    }

    @Test
    public void pilotHasRankTitle(){
        assertEquals("Captain", pilot.getRank().getRankTitle());
    }

    @Test
    public void pilotHasLicenseNumber(){
        assertEquals("AB123456", pilot.getPilotLicenseNumber());
    }

    @Test
    public void pilotCanFlyPlane(){
        assertEquals("This is Captain Lewis Robertson speaking, we are clear for take off, please fasten your seatbelts", pilot.flyPlane());
    }
}
