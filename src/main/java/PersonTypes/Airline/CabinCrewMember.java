package PersonTypes.Airline;

import Enums.Rank;

public class CabinCrewMember extends Staff{

    private String name;
    private Rank rank;

    public CabinCrewMember(String name, Rank rank) {
        super(name, rank);
    }

    public String relayMessageToPassengers(String message){
        return message;
    }
}
