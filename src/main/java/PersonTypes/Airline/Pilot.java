package PersonTypes.Airline;

import Enums.Rank;
import com.sun.xml.internal.ws.api.message.Message;

import java.text.MessageFormat;

public class Pilot extends Staff{

    private String name;
    private String pilotLicenseNumber;
    private Rank rank;

    public Pilot(String name, Rank rank, String pilotLicenseNumber) {
        super(name, rank);
        this.pilotLicenseNumber = pilotLicenseNumber;
    }

    public String getPilotLicenseNumber() {
        return pilotLicenseNumber;
    }

    public void setPilotLicenseNumber(String pilotLicenseNumber) {
        this.pilotLicenseNumber = pilotLicenseNumber;
    }

    public String flyPlane(){
        return String.format("This is %s %s speaking, we are clear for take off, please fasten your seatbelts", getRank().getRankTitle(), getName());
    }
}
