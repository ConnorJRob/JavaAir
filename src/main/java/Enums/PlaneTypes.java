package Enums;

public enum PlaneTypes {

    BOEING747(213869,348540, 368),
    BOEING767(110976,246420, 220),
    BOEING777(162721,298500, 150),
    BOEING787(107386,235670, 140),
    AIRBUSA310(270210,490120, 420);

    private final double planeWeight;
    private final double maximumFlightWeight;
    private final int bookableSeats;

    PlaneTypes(double planeWeight, double maximumFlightWeight, int bookableSeats){
        this.planeWeight = planeWeight;
        this.maximumFlightWeight = maximumFlightWeight;
        this.bookableSeats = bookableSeats;
    }

    public double getPlaneWeight() {
        return planeWeight;
    }

    public double getMaximumFlightWeight() {
        return maximumFlightWeight;
    }

    public int getBookableSeats() {
        return bookableSeats;
    }
}
