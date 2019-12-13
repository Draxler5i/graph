import java.util.ArrayList;

public class Airport {
    private String city;
    private String name;
    private Location location;
    private ArrayList<String> connections;
    private int landingTrack;
    private OfficeHours officeHours;

    public Airport(){}

    public Airport(String city, String name, Location location, ArrayList<String> connections, int landingTrack, OfficeHours officeHours) {
        this.city = city;
        this.name = name;
        this.location = location;
        this.connections = connections;
        this.landingTrack = landingTrack;
        this.officeHours = officeHours;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setConnections(ArrayList<String> connections) {
        this.connections = connections;
    }

    public void setLandingTrack(int landingTrack) {
        this.landingTrack = landingTrack;
    }

    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public ArrayList<String> getConnections() {
        return connections;
    }

    public int getLandingTrack() {
        return landingTrack;
    }

    public OfficeHours getOfficeHours() {
        return officeHours;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "\ncity='" + city + '\'' +
                ", \nname='" + name + '\'' +
                ", \n" + location.toString() +
                ", \nconnections=" + connections.toString() +
                ", \nlandingTrack=" + landingTrack +
                ", \n" + officeHours.toString() +
                '}';
    }
}
