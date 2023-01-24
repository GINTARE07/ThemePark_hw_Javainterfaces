package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements  IReviewed {

    public Playground(String name, int rating) {
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
