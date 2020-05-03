package dat19v2.niklasbrock.weatherrestful.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wind
{
    private String deg;

    private String speed;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDeg ()
    {
        return deg;
    }

    public void setDeg (String deg)
    {
        this.deg = deg;
    }

    public String getSpeed ()
    {
        return speed;
    }

    public void setSpeed (String speed)
    {
        this.speed = speed;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [deg = "+deg+", speed = "+speed+"]";
    }
}
