package dat19v2.niklasbrock.weatherrestful.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Weather
{
    private String icon;

    private String description;

    private String main;

    @Id
    private String id;

    public String getIcon ()
    {
        return icon;
    }

    public void setIcon (String icon)
    {
        this.icon = icon;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getMain ()
    {
        return main;
    }

    public void setMain (String main)
    {
        this.main = main;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [icon = "+icon+", description = "+description+", main = "+main+", id = "+id+"]";
    }
}
