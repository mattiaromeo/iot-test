package be.domain;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "TEMP")
public class TempData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "timestamp")
    private Timestamp timestamp;
    @Column(name = "temperature")
    private double temp;

    public TempData() {
    }

    public TempData(Timestamp timestamp, double temp) {
        this.timestamp = timestamp;
        this.temp = temp;
    }

    public int getId() {
        return id;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public double getTemp() {
        return temp;
    }
}
