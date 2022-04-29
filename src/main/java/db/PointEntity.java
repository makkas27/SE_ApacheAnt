package db;

import javax.persistence.*;

@Entity
@Table(name = "points")
public class PointEntity {
    public PointEntity() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getY() {
        return y;
    }

    public void setY(Float y) {
        this.y = y;
    }

    public Float getR() {
        return r;
    }

    public void setR(Float r) {
        this.r = r;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

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

    @Override
    public String toString() {
        return "PointEntity{" +
                "id=" + id +
                ", x=" + x +
                ", y=" + y +
                ", r=" + r +
                ", result='" + result + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
