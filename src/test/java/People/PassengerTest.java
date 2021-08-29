package People;

import PersonTypes.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Connor Robertson", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Connor Robertson", passenger.getName());
    }

    @Test
    public void passengerHasBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }
}
