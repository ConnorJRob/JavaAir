package PersonTypes.Airline;

import Enums.Rank;
import Person.Person;

public abstract class Staff extends Person {

    private String name;
    private Rank rank;

    public Staff(String name, Rank rank) {
        super(name);
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
}
