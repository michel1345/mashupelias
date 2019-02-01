package mashup.model.aircraft;

public class Aircraft {
    private String planeTypeId;
    private String nameAircraft;
    private String codeIataAircraft;

    public Aircraft(String planeTypeId, String nameAircraft, String codeIataAircraft) {
        this.planeTypeId = planeTypeId;
        this.nameAircraft = nameAircraft;
        this.codeIataAircraft = codeIataAircraft;
    }

    public String getPlaneTypeId() {
        return planeTypeId;
    }

    public void setPlaneTypeId(String planeTypeId) {
        this.planeTypeId = planeTypeId;
    }

    public String getNameAircraft() {
        return nameAircraft;
    }

    public void setNameAircraft(String nameAircraft) {
        this.nameAircraft = nameAircraft;
    }

    public String getCodeIataAircraft() {
        return codeIataAircraft;
    }

    public void setCodeIataAircraft(String codeIataAircraft) {
        this.codeIataAircraft = codeIataAircraft;
    }
}
