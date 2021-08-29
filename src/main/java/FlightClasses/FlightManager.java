package FlightClasses;

public class FlightManager {

    private Flight flight;
    private double capacityWeight;
    private double totalFlightBaggageAllowanceWeight;
    private double individualBaggageAllowance;
    private double totalCurrentBaggageWeight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }

    public double calculateIndividualBaggageAllowance() {
       capacityWeight = flight.getPlane().getPlaneType().getMaximumFlightWeight() - flight.getPlane().getPlaneType().getPlaneWeight();
       totalFlightBaggageAllowanceWeight = capacityWeight - (flight.getPlane().getPlaneType().getBookableSeats() * 100);
       individualBaggageAllowance = totalFlightBaggageAllowanceWeight / flight.getPlane().getPlaneType().getBookableSeats();
       return individualBaggageAllowance;
    }

    public double CalculateTotalCurrentBaggageWeight() {
        totalCurrentBaggageWeight = 0;
        flight.getBookedPassengers().forEach(passenger -> totalCurrentBaggageWeight += passenger.getBaggageWeight());
        return totalCurrentBaggageWeight;
    }

    public double calculateRemainingBaggageAllowance() {
        capacityWeight = flight.getPlane().getPlaneType().getMaximumFlightWeight() - flight.getPlane().getPlaneType().getPlaneWeight();
        totalFlightBaggageAllowanceWeight = capacityWeight - (flight.getPlane().getPlaneType().getBookableSeats() * 100);
        return totalFlightBaggageAllowanceWeight - totalCurrentBaggageWeight;
    }
}
