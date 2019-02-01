package mashup.model.airline;

public class Airline {

    private Integer airlineId;
    private String nameAirline;
    private String codeIataAirline;
    private Integer iataPrefixAccounting;
    private String codeIcaoAirline;
    private String callsign;

    public Airline(Integer airlineId, String nameAirline, String codeIataAirline, Integer iataPrefixAccounting, String codeIcaoAirline, String callsign, String type, String statusAirline, Integer sizeAirline, Double ageFleet, Integer founding, String codeHub, String nameCountry, String codeIso2Country) {
        this.airlineId = airlineId;
        this.nameAirline = nameAirline;
        this.codeIataAirline = codeIataAirline;
        this.iataPrefixAccounting = iataPrefixAccounting;
        this.codeIcaoAirline = codeIcaoAirline;
        this.callsign = callsign;
        this.type = type;
        this.statusAirline = statusAirline;
        this.sizeAirline = sizeAirline;
        this.ageFleet = ageFleet;
        this.founding = founding;
        this.codeHub = codeHub;
        this.nameCountry = nameCountry;
        this.codeIso2Country = codeIso2Country;
    }

    public Integer getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(Integer airlineId) {
        this.airlineId = airlineId;
    }

    public String getNameAirline() {
        return nameAirline;
    }

    public void setNameAirline(String nameAirline) {
        this.nameAirline = nameAirline;
    }

    public String getCodeIataAirline() {
        return codeIataAirline;
    }

    public void setCodeIataAirline(String codeIataAirline) {
        this.codeIataAirline = codeIataAirline;
    }

    public Integer getIataPrefixAccounting() {
        return iataPrefixAccounting;
    }

    public void setIataPrefixAccounting(Integer iataPrefixAccounting) {
        this.iataPrefixAccounting = iataPrefixAccounting;
    }

    public String getCodeIcaoAirline() {
        return codeIcaoAirline;
    }

    public void setCodeIcaoAirline(String codeIcaoAirline) {
        this.codeIcaoAirline = codeIcaoAirline;
    }

    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatusAirline() {
        return statusAirline;
    }

    public void setStatusAirline(String statusAirline) {
        this.statusAirline = statusAirline;
    }

    public Integer getSizeAirline() {
        return sizeAirline;
    }

    public void setSizeAirline(Integer sizeAirline) {
        this.sizeAirline = sizeAirline;
    }

    public Double getAgeFleet() {
        return ageFleet;
    }

    public void setAgeFleet(Double ageFleet) {
        this.ageFleet = ageFleet;
    }

    public Integer getFounding() {
        return founding;
    }

    public void setFounding(Integer founding) {
        this.founding = founding;
    }

    public String getCodeHub() {
        return codeHub;
    }

    public void setCodeHub(String codeHub) {
        this.codeHub = codeHub;
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

    private String type;
    private String statusAirline;
    private Integer sizeAirline;
    private Double ageFleet;
    private Integer founding;
    private String codeHub;
    private String nameCountry;
    private String codeIso2Country;
}
