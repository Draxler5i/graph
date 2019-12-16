import java.util.Arrays;

public class FlightPlan {

    private Airplane airplane;
    private Location origin;
    private Location[] scales;
    private Location destiny;

    public FlightPlan(Airplane airplane, Location origin, Location[] scales, Location destiny) {
        this.airplane = airplane;
        this.origin = origin;
        this.scales = scales;
        this.destiny = destiny;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public Location getOrigin() {
        return origin;
    }

    public Location[] getScales() {
        return scales;
    }

    public Location getDestiny() {
        return destiny;
    }

    @Override
    public String toString() {
        return "FlightPlan {" +
                "\nairplane=" + airplane +
                ",\n origin=" + origin +
                ",\n scales=" + Arrays.toString(scales) +
                ",\n destiny=" + destiny +
                '}';
    }
}
