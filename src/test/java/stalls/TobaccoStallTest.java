package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitorOver18;
    Visitor visitorUnder18;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        visitorOver18 = new Visitor(21, 2.2, 50);
        visitorUnder18 = new Visitor(17, 2.3, 40);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void willAdmitVisitorOver18() {
        assertEquals(true, tobaccoStall.isAllowedTo(visitorOver18));
    }

    @Test
    public void willNotAdmitVisitorUnder18() {
        assertEquals(false, tobaccoStall.isAllowedTo(visitorUnder18));
    }
}
