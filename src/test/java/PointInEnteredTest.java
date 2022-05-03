import beans.Point;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PointInEnteredTest {

    @Test
    public void checkZeroEntered(){
        assertTrue(true);
    }

    @Test
    public void emptyConstructor() {
        Point empty = new Point();
        assertAll(
                () -> assertNotNull(empty, "Объект не был создан"),
                () -> assertEquals(1.0f, empty.getrValue()),
                () -> assertEquals(0d, empty.getxCoordinate()),
                () -> assertEquals(0d, empty.getyCoordinate()),
                () -> assertEquals(null, empty.getResult())
        );
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

    @Test
    public void checkArea_db() {
        Point p = new Point();
        p.setxCoordinate(-1);
        p.setyCoordinate(1);
        p.setrValue(2);
        p.checkPoint();
        assertEquals( p.getPoints().size(), 1, "Dot wasn't added to list properly");
    }

}
