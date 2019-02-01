package mashup;

import com.google.gson.*;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Controller {


    public TextField latitude;
    public TextField longitude;
    public TextField altitude;
    public TextField direction;
    public TextField horizontal;
    public TextField isGround;
    public TextField vertical;
    public TextField regNumber;
    public TextField icaoCode;
    public TextField icao24;
    public TextField iataCode;
    public TextField iataNumber;
    public TextField icaoNumber;
    public TextField number;



    public void getFlightData() throws Exception {
        //2. Convert object to JSON string and save into a file directly
        String flightsJsonArrString = getHTML("http://aviation-edge.com/v2/public/flights?key=8bfd62-87335a&arrIata=GIG").replace(" ", "");

        JsonParser parser = new JsonParser();
        JsonElement flightElement = parser.parse(flightsJsonArrString);
        JsonArray responseData = flightElement.getAsJsonArray();

        JsonObject aircData = new Gson().fromJson(responseData.get(0), JsonObject.class);
        // System.out.println(aircData);

        JsonObject geography = new Gson().fromJson(aircData.get("geography"), JsonObject.class);
        JsonObject speed = new Gson().fromJson(aircData.get("speed"), JsonObject.class);
        JsonObject aircraft = new Gson().fromJson(aircData.get("aircraft"), JsonObject.class);
        JsonObject flight = new Gson().fromJson(aircData.get("flight"), JsonObject.class);

        System.out.println(geography.toString());
        System.out.println(speed.toString());
        System.out.println(aircraft.toString());
        System.out.println(flight.toString());

        latitude.setText(geography.get("latitude").toString());
        longitude.setText(geography.get("longitude").toString());
        altitude.setText(geography.get("altitude").toString());
        direction.setText(geography.get("direction").toString());
        horizontal.setText(speed.get("horizontal").toString());
        isGround.setText(speed.get("isGround").toString());
        vertical.setText(speed.get("vertical").toString());
        regNumber.setText(aircraft.get("regNumber").toString());
        icaoCode.setText(aircraft.get("icaoCode").toString());
        icao24.setText(aircraft.get("icao24").toString());
        iataCode.setText(aircraft.get("iataCode").toString());
        iataNumber.setText(flight.get("iataNumber").toString());
        icaoNumber.setText(flight.get("icaoNumber").toString());
        number.setText(flight.get("number").toString());
    }


    public String getHTML(String urlToRead) throws Exception {
        StringBuilder result = new StringBuilder();
        URL url = new URL(urlToRead);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        rd.close();
        return result.toString();
    }


}
