package dat19v2.niklasbrock.weatherrestful.model.jsontopojo;

import javax.persistence.*;

@Entity
public class Area
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long primaryKey;

    private String visibility;

    private String timezone;

    @OneToOne (cascade = CascadeType.ALL)
    private Main main;

    @OneToOne (cascade = CascadeType.ALL)
    private Clouds clouds;

    @OneToOne (cascade = CascadeType.ALL)
    private Sys sys;

    private String dt;

    @OneToOne (cascade = CascadeType.ALL)
    private Coord coord;

    @ManyToOne
    private Weather[] weather;

    private String name;

    private String cod;

    private String id;

    private String base;

    @OneToOne (cascade = CascadeType.ALL)
    private Wind wind;

    public long getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getVisibility()
    {
        return visibility;
    }

    public void setVisibility(String visibility)
    {
        this.visibility = visibility;
    }

    public String getTimezone()
    {
        return timezone;
    }

    public void setTimezone(String timezone)
    {
        this.timezone = timezone;
    }

    public Main getMain()
    {
        return main;
    }

    public void setMain(Main main)
    {
        this.main = main;
    }

    public Clouds getClouds()
    {
        return clouds;
    }

    public void setClouds(Clouds clouds)
    {
        this.clouds = clouds;
    }

    public Sys getSys()
    {
        return sys;
    }

    public void setSys(Sys sys)
    {
        this.sys = sys;
    }

    public String getDt()
    {
        return dt;
    }

    public void setDt(String dt)
    {
        this.dt = dt;
    }

    public Coord getCoord()
    {
        return coord;
    }

    public void setCoord(Coord coord)
    {
        this.coord = coord;
    }

    public Weather[] getWeather()
    {
        return weather;
    }

    public void setWeather(Weather[] weather)
    {
        this.weather = weather;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getCod()
    {
        return cod;
    }

    public void setCod(String cod)
    {
        this.cod = cod;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getBase()
    {
        return base;
    }

    public void setBase(String base)
    {
        this.base = base;
    }

    public Wind getWind()
    {
        return wind;
    }

    public void setWind(Wind wind)
    {
        this.wind = wind;
    }

}
