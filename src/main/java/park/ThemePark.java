package park;

import attractions.*;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;
import java.util.Arrays;

public class ThemePark{

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

    public ArrayList<IReviewed> getAllReviewed() {
        return null;
    }

    public void visit(Visitor visitor, Attraction attraction) {
        attraction.addVisitor();
        visitor.addAttractionToVisited(attraction);
    }
}
