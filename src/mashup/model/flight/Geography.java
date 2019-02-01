package mashup.model.flight;

public class Geography {
    private String altitude;

    private String latitude;

    private String longitude;

    private String direction;

    public String getAltitude ()
    {
        return altitude;
    }

    public void setAltitude (String altitude)
    {
        this.altitude = altitude;
    }

    public String getLatitude ()
    {
        return latitude;
    }

    public void setLatitude (String latitude)
    {
        this.latitude = latitude;
    }

    public String getLongitude ()
    {
        return longitude;
    }

    public void setLongitude (String longitude)
    {
        this.longitude = longitude;
    }

    public String getDirection ()
    {
        return direction;
    }

    public void setDirection (String direction)
    {
        this.direction = direction;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [altitude = "+altitude+", latitude = "+latitude+", longitude = "+longitude+", direction = "+direction+"]";
    }
}
