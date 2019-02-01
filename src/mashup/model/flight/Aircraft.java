package mashup.model.flight;

public class Aircraft {
    private String regNumber;

    private String icaoCode;

    private String iataCode;

    private String icao24;

    public String getRegNumber ()
    {
        return regNumber;
    }

    public void setRegNumber (String regNumber)
    {
        this.regNumber = regNumber;
    }

    public String getIcaoCode ()
    {
        return icaoCode;
    }

    public void setIcaoCode (String icaoCode)
    {
        this.icaoCode = icaoCode;
    }

    public String getIataCode ()
    {
        return iataCode;
    }

    public void setIataCode (String iataCode)
    {
        this.iataCode = iataCode;
    }

    public String getIcao24 ()
    {
        return icao24;
    }

    public void setIcao24 (String icao24)
    {
        this.icao24 = icao24;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [regNumber = "+regNumber+", icaoCode = "+icaoCode+", iataCode = "+iataCode+", icao24 = "+icao24+"]";
    }
}
