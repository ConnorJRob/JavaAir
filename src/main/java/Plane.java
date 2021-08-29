import Enums.PlaneTypes;

public class Plane {

    private PlaneTypes planeType;
    private double capacity;
    private double totalWeight;

    public Plane(PlaneTypes planeType) {
        this.planeType = planeType;
        this.capacity = planeType.getMaximumFlightWeight() - planeType.getPlaneWeight();
    }

    public PlaneTypes getPlaneType() {
        return planeType;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getTotalWeight() {
        return totalWeight;
    }
}
