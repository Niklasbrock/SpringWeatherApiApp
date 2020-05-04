package dat19v2.niklasbrock.weatherrestful.model.jsontopojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Main
{
    private String temp;

    private String temp_min;

    private String humidity;

    private String pressure;

    private String feels_like;

    private String temp_max;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTemp()
    {
        return temp;
    }

    public void setTemp (String temp)
    {
        this.temp = temp;
    }

    public String getTemp_min()
    {
        return temp_min;
    }

    public void setTemp_min (String temp_min)
    {
        this.temp_min = temp_min;
    }

    public String getHumidity()
    {
        return humidity;
    }

    public void setHumidity (String humidity)
    {
        this.humidity = humidity;
    }

    public String getPressure()
    {
        return pressure;
    }

    public void setPressure (String pressure)
    {
        this.pressure = pressure;
    }

    public String getFeels_like()
    {
        return feels_like;
    }

    public void setFeels_like (String feels_like)
    {
        this.feels_like = feels_like;
    }

    public String getTemp_max()
    {
        return temp_max;
    }

    public void setTemp_max (String temp_max)
    {
        this.temp_max = temp_max;
    }

}

