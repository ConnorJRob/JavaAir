import Enums.PlaneTypes;
import FlightClasses.Plane;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneTypes.BOEING747);
    }

    @Test
    public void planeHasType(){
        assertEquals(PlaneTypes.BOEING747, plane.getPlaneType());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(134671, plane.getCapacity(),0);
    }

    @Test
    public void planeHasWeight(){
        assertEquals(213869, plane.getPlaneType().getPlaneWeight(), 0);
    }

    @Test
    public void planeHasMaxFlightWeight(){
        assertEquals(348540, plane.getPlaneType().getMaximumFlightWeight(), 0);
    }

    @Test
    public void planeHasBookableSeats(){
        assertEquals(368, plane.getPlaneType().getBookableSeats());
    }

}
