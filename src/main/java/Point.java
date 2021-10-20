import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Point {
    private float xCoordinate;
    private float yCoordinate;
    private float rValue;
    private String result;
    private LocalDateTime time;

    public Point(){

    }
}
