package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

import javax.swing.*;
import java.util.ArrayList;

public class RollerCoaster  extends Attraction implements IReviewed, ITicketed {

//    ArrayList<Visitor> visitors;
    private RollerCoaster(String name, int rating) {
        super(name, rating);
//        this.visitors = new ArrayList<Visitor>();
    }
    public static RollerCoaster createRollerCoaster(String name, int rating) {
        return new RollerCoaster(name, rating);
    }
//    public ArrayList<Visitor> getVisitors() {
//        return visitors;
//    }

//
//    @Override
//    public boolean isAllowedTo(Visitor) {
//        new RollerCoaster().getVisitors() ? isAllowedTo() : "You can go on this ride";}

    //        return this.getVisitor()< this.
//    }
//    public boolean isHigherThanAndOlderThan() {
//        isAllowedTo(Visitor) : this.visitors.
//        return isAllowedTo();
//        }
//
//    public void setAlowedVisitorsAgeAndHeight(Visitor age, Visitor height){

//        Visitor.getAge + Visitor.setHeight(height)

    @Override
    public int getRating() {
        return 10;
    }

    @Override
    public String getName() {
        return "Blue Ridge";
    }
    public Object getVisitor(){
        return 0;
    }

    @Override
    public int review() {
        return 0;
    }

    @Override
    public String geCustomertName() {
        return null;
    }

//    }

    @Override
    public double priceFor(double visitors) {
        return 16.80;
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    }

