package Enums;

public enum Rank {

    CAPTAIN("Captain"),
    FIRSTOFFICER("First Officer"),
    PURSER("Purser"),
    FLIGHTATTENDANT("Flight Attendant")
    ;

    private final String rankTitle;

    Rank(String rankTitle){
        this.rankTitle = rankTitle;
    }

    public String getRankTitle(){
        return this.rankTitle;
    }
}
