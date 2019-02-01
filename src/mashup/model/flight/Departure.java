package mashup.model.flight;

public class Departure {
    private String iataCode;

    private String icaoCode;

    public String getIataCode ()
    {
        return iataCode;
    }

    public void setIataCode (String iataCode)
    {
        this.iataCode = iataCode;
    }

    public String getIcaoCode ()
    {
        return icaoCode;
    }

    public void setIcaoCode (String icaoCode)
    {
        this.icaoCode = icaoCode;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [iataCode = "+iataCode+", icaoCode = "+icaoCode+"]";
    }
}
