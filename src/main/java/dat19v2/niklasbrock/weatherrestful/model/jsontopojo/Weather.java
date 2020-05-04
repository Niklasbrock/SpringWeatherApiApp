package dat19v2.niklasbrock.weatherrestful.model.jsontopojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Weather
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long primaryKey;

    private String icon;

    private String description;

    private String main;

    private String id;


    public long getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }

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

}
