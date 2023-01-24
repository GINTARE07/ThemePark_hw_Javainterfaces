package attractions;

import behaviours.IReviewed;

public class Dodgems extends Attraction implements IReviewed {

    public Dodgems(String name, int rating) {
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


}
