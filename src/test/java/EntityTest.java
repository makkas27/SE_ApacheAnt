import db.PointEntity;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntityTest {

    @Test
    public void checkString(){
        PointEntity p = new PointEntity();
        p.setId(1);
        p.setX(3F);
        p.setY(3F);
        p.setR(3F);
        p.setResult("Промах");
        p.setTime("16:40");

        assertEquals("PointEntity{id=1, x=3.0, y=3.0, r=3.0, result='Промах', time='16:40'}", p.toString());
    }
}
