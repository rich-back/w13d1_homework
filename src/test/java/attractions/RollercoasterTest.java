package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitorShort;
    Visitor visitorTall;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitorShort = new Visitor(12, 1.5, 20);
        visitorTall = new Visitor(25, 2.1, 200);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void willChargeDefaultIfUnder2m() {
        assertEquals(8.40, rollerCoaster.priceFor(visitorShort), 0.0);
    }

    @Test
    public void willChargeDoubleIfOver2m() {
        assertEquals(16.80, rollerCoaster.priceFor(visitorTall), 0.0);
    }
}
