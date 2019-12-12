public class Location {
    private String country;
    private String city;
    private long [] location;

    public Location(String country, String city, long[] location) {
        this.country = country;
        this.city = city;
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public long[] getLocation() {
        return location;
    }
}
