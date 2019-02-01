package mashup.model.flight;

public class Flight {

    private Geography geography;
    private Aircraft aircraft;
    private Airline airline;
    private  Arrival arrival;
    private Departure departure;
    private Speed speed;
    private System system;
    private String status;

    public Flight(Geography geography, Aircraft aircraft, Airline airline, Arrival arrival, Departure departure, Speed speed, System system, String status) {
        this.geography = geography;
        this.aircraft = aircraft;
        this.airline = airline;
        this.arrival = arrival;
        this.departure = departure;
        this.speed = speed;
        this.system = system;
        this.status = status;
    }

    public Geography getGeography() {
        return geography;
    }

    public void setGeography(Geography geography) {
        this.geography = geography;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public Arrival getArrival() {
        return arrival;
    }

    public void setArrival(Arrival arrival) {
        this.arrival = arrival;
    }

    public Departure getDeparture() {
        return departure;
    }

    public void setDeparture(Departure departure) {
        this.departure = departure;
    }

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public System getSystem() {
        return system;
    }

    public void setSystem(System system) {
        this.system = system;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
