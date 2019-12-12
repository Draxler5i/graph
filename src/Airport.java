public class Airport {
    private String name;
    private Location location;
    private String[] connections;
    private int landingTrack;
    private OfficeHours officeHours;

    public Airport(){}

    public Airport(String name, Location location, String[] connections, int landingTrack, OfficeHours officeHours) {
        this.name = name;
        this.location = location;
        this.connections = connections;
        this.landingTrack = landingTrack;
        this.officeHours = officeHours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setConnections(String[] connections) {
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

    public String[] getConnections() {
        return connections;
    }

    public int getLandingTrack() {
        return landingTrack;
    }

    public OfficeHours getOfficeHours() {
        return officeHours;
    }
}
