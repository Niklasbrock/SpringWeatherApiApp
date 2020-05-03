package dat19v2.niklasbrock.weatherrestful.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Clouds
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String alll;

    public String getAlll()
    {
        return alll;
    }

    public void setAlll(String alll)
    {
        this.alll = alll;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [all = "+ alll +"]";
    }
}
