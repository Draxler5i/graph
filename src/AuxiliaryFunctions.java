import java.util.Random;

public class AuxiliaryFunctions {

    public static Airport[] generateAirports(int cantAirports) {
        Airport[] airports = new Airport[cantAirports];
        for (int i = 0; i < cantAirports -1; i++) {
            airports[i] = generateAirport();
        }
        return airports;
    }
    private static Airport generateAirport() {
        Airport airport = new Airport();
        airport.setName(getAirportNames()[new Random().nextInt(getAirportNames().length)]);
        airport.setLocation(getLocations()[new Random().nextInt(getLocations().length)]);
        airport.setConnections(getConnections());
        airport.setLandingTrack(getLandingTrack()[new Random().nextInt(getLandingTrack().length)]);
        airport.setOfficeHours(getOfficeHours()[new Random().nextInt(getOfficeHours().length)]);
        return airport;
    }
    private static String[] getAirportNames() {
        String[] names = {"LA Airport, Jorge Wilstermann"};
        return names;
    }
    private static Location[] getLocations() {
        long[] location = {(long) 15.666, (long) -11.435 };
        Location[] locations = {(new Location("EEUU", "Los Angeles", location))};
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
    private static String[] getConnections() {
        Location[] locations = getLocations();
        int randomCantLocation = new Random().nextInt(locations.length);
        String[] connections = new String[randomCantLocation];
        for (int i = 0; i < connections.length; i++) {
            connections[i] = locations[new Random().nextInt(locations.length)].getCity();
        }
        return connections;
    }
    private static String[] getOfficeDays() {
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        return days;
    }
}