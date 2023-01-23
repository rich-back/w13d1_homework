package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitorUnder12;
    Visitor visitorOver12;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitorUnder12 = new Visitor(11, 1.5, 20);
        visitorOver12 = new Visitor(13, 1.4, 200);

    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }
    @Test
    public void willChargeDefaultIfOver12() {
        assertEquals(4.50, dodgems.priceFor(visitorOver12), 0.0);
    }

    @Test
    public void willChargeHalfIfUnder12() {
        assertEquals(2.25, dodgems.priceFor(visitorUnder12), 0.0);
    }
}
