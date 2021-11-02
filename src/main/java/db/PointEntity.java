package db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "points")
public class PointEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "x")
    private float xCoordinate;
    @Column(name = "y")
    private float yCoordinate;
    @Column(name = "r")
    private float rValue;
    private String result;
    private LocalDateTime time;

    public String getStringTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss  dd.MM.yy");
        return time.format(formatter);
    }




}
