package park;

import attractions.Attraction;
import attractions.Dodgems;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.Stall;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Attraction rollercoaster;
    Attraction dodgems;
    Stall iceCreamStall;
    Stall tobaccoStall;

    @Before
    public void before() {
        themePark = new ThemePark();
        rollercoaster = new RollerCoaster("Death Slide", 8);
        dodgems = new Dodgems("Bumpee", 9);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4, 9);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 6);
    }

    @Test
    public void canAddAttraction() {
        themePark.addAttraction(rollercoaster);
        themePark.addAttraction(dodgems);
        assertEquals(2, themePark.getAttractions());
    }

    @Test
    public void canAddStall() {
        themePark.addStall(iceCreamStall);
        assertEquals(1, themePark.getStalls());
    }

    @Test
    public void canRemoveAttraction() {
        themePark.addAttraction(rollercoaster);
        themePark.addAttraction(dodgems);
        themePark.removeAttraction(rollercoaster);
        assertEquals(1, themePark.getAttractions());
    }

    @Test
    public void canRemoveStall() {
        themePark.addStall(iceCreamStall);
        themePark.addStall(tobaccoStall);
        themePark.removeStall(tobaccoStall);
        assertEquals(1, themePark.getStalls());
    }
}
