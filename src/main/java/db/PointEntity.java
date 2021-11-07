package db;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Table(name = "points")
@ToString
@Getter
@Setter
public class PointEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "x")
    private Float x;
    @Column(name = "y")
    private Float y;
    @Column(name = "r")
    private Float r;
    private String result;
    private String time;
}
