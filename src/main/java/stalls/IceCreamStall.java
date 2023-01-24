package stalls;

import behaviours.IReviewed;

public class IceCreamStall extends Stall implements IReviewed {

    public IceCreamStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public int review() {
        return 0;
    }

    @Override
    public String geCustomertName() {
        return null;
    }

    @Override
    public String getName() {
        return "";
    }
}
