package park;

import attractions.Attraction;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(){
        attractions = new ArrayList<>();
        stalls = new ArrayList<>();
    }

    public int getAttractions() {
        return attractions.size();
    }
    public int getStalls() {
        return stalls.size();
    }

    public void addAttraction(Attraction attraction) {
        attractions.add(attraction);
    }
    public void addStall(Stall stall) {
        stalls.add(stall);
    }

    public void removeAttraction(Attraction attraction) {
        attractions.remove(attraction);
    }    public void removeStall(Stall stall) {
        stalls.remove(stall);
    }
}
