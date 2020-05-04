package dat19v2.niklasbrock.weatherrestful.model.jsontopojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sys
{
    private String country;

    private String sunrise;

    private String sunset;

    private String id;

    private String type;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long primaryKey;

    public long getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getCountry ()
    {
        return country;
    }

    public void setCountry (String country)
    {
        this.country = country;
    }

    public String getSunrise ()
    {
        return sunrise;
    }

    public void setSunrise (String sunrise)
    {
        this.sunrise = sunrise;
    }

    public String getSunset ()
    {
        return sunset;
    }

    public void setSunset (String sunset)
    {
        this.sunset = sunset;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

}
