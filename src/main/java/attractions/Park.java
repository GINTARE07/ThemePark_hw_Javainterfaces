package attractions;

import behaviours.IReviewed;

public class Park extends Attraction implements IReviewed {

    public Park(String name, int rating) {
        super(name, rating);
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
