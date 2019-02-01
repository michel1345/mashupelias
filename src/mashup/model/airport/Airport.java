package mashup.model.airport;

public class Airport {

    private Integer airportId;
    private String nameAirport;
    private String codeIataAirport;
    private String nameTranslations;
    private String latitudeAirport;

    public Airport(Integer airportId, String nameAirport, String codeIataAirport, String nameTranslations, String latitudeAirport, String longitudeAirport, Integer geonameId, String timezone, String gmt, String phone, String nameCountry, String codeIso2Country, String codeIataCity) {
        this.airportId = airportId;
        this.nameAirport = nameAirport;
        this.codeIataAirport = codeIataAirport;
        this.nameTranslations = nameTranslations;
        this.latitudeAirport = latitudeAirport;
        this.longitudeAirport = longitudeAirport;
        this.geonameId = geonameId;
        this.timezone = timezone;
        this.gmt = gmt;
        this.phone = phone;
        this.nameCountry = nameCountry;
        this.codeIso2Country = codeIso2Country;
        this.codeIataCity = codeIataCity;
    }

    public Integer getAirportId() {
        return airportId;
    }

    public void setAirportId(Integer airportId) {
        this.airportId = airportId;
    }

    public String getNameAirport() {
        return nameAirport;
    }

    public void setNameAirport(String nameAirport) {
        this.nameAirport = nameAirport;
    }

    public String getCodeIataAirport() {
        return codeIataAirport;
    }

    public void setCodeIataAirport(String codeIataAirport) {
        this.codeIataAirport = codeIataAirport;
    }

    public String getNameTranslations() {
        return nameTranslations;
    }

    public void setNameTranslations(String nameTranslations) {
        this.nameTranslations = nameTranslations;
    }

    public String getLatitudeAirport() {
        return latitudeAirport;
    }

    public void setLatitudeAirport(String latitudeAirport) {
        this.latitudeAirport = latitudeAirport;
    }

    public String getLongitudeAirport() {
        return longitudeAirport;
    }

    public void setLongitudeAirport(String longitudeAirport) {
        this.longitudeAirport = longitudeAirport;
    }

    public Integer getGeonameId() {
        return geonameId;
    }

    public void setGeonameId(Integer geonameId) {
        this.geonameId = geonameId;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getGmt() {
        return gmt;
    }

    public void setGmt(String gmt) {
        this.gmt = gmt;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public String getCodeIso2Country() {
        return codeIso2Country;
    }

    public void setCodeIso2Country(String codeIso2Country) {
        this.codeIso2Country = codeIso2Country;
    }

    public String getCodeIataCity() {
        return codeIataCity;
    }

    public void setCodeIataCity(String codeIataCity) {
        this.codeIataCity = codeIataCity;
    }

    private String longitudeAirport;
    private Integer geonameId;
    private String timezone;
    private String gmt;
    private String phone;
    private String nameCountry;
    private String codeIso2Country;
    private String codeIataCity;
}
