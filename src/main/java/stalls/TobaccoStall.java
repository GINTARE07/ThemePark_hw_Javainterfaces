package stalls;

import behaviours.IReviewed;
import behaviours.ISecurity;

public class TobaccoStall extends Stall implements IReviewed {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
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
