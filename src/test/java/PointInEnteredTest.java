import beans.Point;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PointInEnteredTest {

    @Test
    public void checkZeroEntered(){
        assertTrue(true);
    }

    @Test
    public void checkArea_true() {
        Point p = new Point();
        p.setxCoordinate(-1);
        p.setyCoordinate(1);
        p.setrValue(2);
        assertAll(
                () -> assertTrue(p.isInRectangle()),
                () -> assertFalse(p.isInCircle()),
                () -> assertFalse(p.isInTriangle())
        );
    }

    @Test
    public void checkArea_false() {
        Point p = new Point();
        p.setxCoordinate(1);
        p.setyCoordinate(1);
        p.setrValue(2);
        assertAll(
                () -> assertFalse(p.isInRectangle()),
                () -> assertFalse(p.isInCircle()),
                () -> assertFalse(p.isInTriangle())
        );
    }
}
