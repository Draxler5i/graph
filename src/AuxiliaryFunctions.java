import java.util.ArrayList;
import java.util.Random;

public class AuxiliaryFunctions {

    public static Airport[] generateAirports(int cantAirports) {
        Airport[] airports = new Airport[cantAirports];
        for (int i = 0; i < cantAirports; i++) {
            airports[i] = generateAirport();
        }
        return airports;
    }
    private static Airport generateAirport() {
        Airport airport = new Airport();
        airport.setCity(getCities()[new Random().nextInt(getCities().length)]);
        airport.setName(getAirportNames()[new Random().nextInt(getAirportNames().length)]);
        airport.setLocation(getLocations()[new Random().nextInt(getLocations().length)]);
        airport.setConnections(getConnections());
        airport.setLandingTrack(getLandingTrack()[new Random().nextInt(getLandingTrack().length)]);
        airport.setOfficeHours(getOfficeHours()[new Random().nextInt(getOfficeHours().length)]);
        return airport;
    }

    private static String[] getCities() {
//        String[] cities = {"Cochabamba", "Los Angeles", "Santa Cruz", "Lima", "Sao Paulo", "Santiago"};
        String[] cities = {"Santa Cruz", "Lima"};
        return cities;
    }

    private static String[] getAirportNames() {
        String[] names = {"LA Airport","Jorge Wilstermann", "Lima airport"};
        return names;
    }
    private static Location[] getLocations() {
        long[] location = {(long) 15.666, (long) -11.435 };
//        String city = getCities()[new Random().nextInt(getCities().length)];
//        String city2 = getCities()[new Random().nextInt(getCities().length)];
        String city = "Lima";
        String city2 = "Santa Cruz";
//        "Cochabamba", "Los Angeles", "Santa Cruz", "Lima", "Sao Paulo", "Santiago"
        Location[] locations = {(new Location("EEUU", city, location)), (new Location("Bolivia", city2, location))};
        return locations;
    }
    private static int[] getLandingTrack() {
        int[] tracks = {12, 14, 7, 9, 11, 16, 18, 14, 15};
        return tracks;
    }

    private static OfficeHours[] getOfficeHours() {
        OfficeHours of1 = new OfficeHours(getOfficeDays(), "7:00","22:00");
        OfficeHours of2 = new OfficeHours(getOfficeDays(), "8:00","21:00");
        OfficeHours of3 = new OfficeHours(getOfficeDays(), "6:45","21:30");
        OfficeHours[] officeHours = {of1, of2, of3};
        return officeHours;
    }
    private static ArrayList<String> getConnections() {
        Location[] locations = getLocations();
        int randomCantLocation = new Random().nextInt(locations.length + 1);
        if (randomCantLocation == 0) {
            randomCantLocation = 1;
        }
        ArrayList<String> connections = new ArrayList<>();
        for (int i = 0; i < randomCantLocation; i++) {
            connections.add(locations[new Random().nextInt(locations.length)].getCity());
        }
        return connections;
    }
    private static String[] getOfficeDays() {
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        return days;
    }
}