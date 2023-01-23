package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlaygroundTest {
    Playground playground;
    Visitor visitorYoung;
    Visitor visitorOld;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitorYoung = new Visitor(13, 1.3, 10);
        visitorOld = new Visitor(26, 1.7, 100);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void willAdmitVisitorUnder15() {
        assertEquals(true, playground.isAllowedTo(visitorYoung));
    }

    @Test
    public void willNotAdmitVisitorOver15() {
        assertEquals(false, playground.isAllowedTo(visitorOld));
    }
}
