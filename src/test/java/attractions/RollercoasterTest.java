package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() {
        rollerCoaster = RollerCoaster.createRollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(22, 155, 87);
        visitor2 = new Visitor(12, 135, 17);
        visitor3 = new Visitor(28, 215, 97);

    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }


    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    //
    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasDefaultPrice() {
        rollerCoaster.defaultPrice();
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.0);
    }
//    @Test
//    public void startsWithNoGuest(){
//        assertEquals(0, rollerCoaster.getVisitors());
//    }
//    @Test
//    public void isHigherThanAndOlderThan(){
//        assertEquals(true, rollerCoaster.isAllowedTo());

//    @Test
//    public void tallPeoplePayDouble(){

    //    }
    @Test
    public void getReview() {
        assertEquals(0, rollerCoaster.review());
    }
}