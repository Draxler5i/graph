import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class AuxiliaryFunctions {

    public static Airport[] generateAirports(int cantAirports) {
        Airport[] airports = new Airport[cantAirports];
        for (int i = 0; i < cantAirports; i++) {
            airports[i] = generateAirport();
        }
        return airports;
    }

    //Todos los aeropuertos deben tener los mismos destinos, para poder crear correctamente el grafo de matriz adyacente
    public static Airport[] get3airports() {

        Airport[] airports = new Airport[3];
        long[] long1 = { (long) 1.2, (long) 4.5};
        Location l1 = new Location("Bolivia", "Cochabamba", long1);
        OfficeHours of1 = new OfficeHours(new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"}, "7:30", "20:30");
        ArrayList<String> con1 = new ArrayList<>();
        con1.add("Santa Cruz");
        con1.add("La Paz");
        List<Fly> sch1 = generateSchedule(con1, l1);
        List<Airplane> airp1 = new ArrayList<>();
        Airplane ap1 = new Airplane(1114, "Boing 774", 160);
        airp1.add(ap1);
        Airport a1 = new Airport("Cochabamba", "Jorge Wilstermann", l1, con1, 5, of1, sch1, airp1);

        long[] long2 = { (long) 1.2, (long) 4.5};
        Location l2 = new Location("Bolivia", "Santa Cruz", long2);
        OfficeHours of2 = new OfficeHours(new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"}, "7:00", "20:30");
        ArrayList<String> con2 = new ArrayList<>();
        con2.add("Cochabamba");
        con2.add("La Paz");
        List<Fly> sch2 = generateSchedule(con2, l2);
        List<Airplane> airp2 = new ArrayList<>();
        Airplane ap2 = new Airplane(1115, "Boing 765", 170);
        airp2.add(ap2);
        Airport a2 = new Airport("Santa Cruz", "Viru Viru", l2, con2, 7, of2, sch2, airp2);

        long[] long3 = { (long) 15.4, (long) -12.3};
        Location l3 = new Location("Bolivia", "La Paz", long3);
        OfficeHours of3 = new OfficeHours(new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"}, "8:30", "22:00");
        ArrayList<String> con3 = new ArrayList<>();
        con3.add("Santa Cruz");
        con3.add("Cochabamba");
        List<Fly> sch3 = generateSchedule(con3, l3);
        List<Airplane> airp3 = new ArrayList<>();
        Airplane ap3 = new Airplane(1116, "Boing 834", 150);
        airp3.add(ap3);
        Airport a3 = new Airport("La Paz", "El alto", l3, con3, 8, of3, sch3, airp3);

        airports[0] = a1;
        airports[1] = a2;
        airports[2] = a3;

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

    private static List<Fly> generateSchedule(ArrayList<String> connections, Location location) {
        List<Fly> schedule = new ArrayList<>();

        return schedule;
    }

    private static Fly generateFly(String origin, String destiny) {
//        Airplane airplane;
//        Location origin;
//        Location destiny;
//        String boardingTime;
//        Date date;
//        FlyStateEnum state;
//        String timeFly;
        return new Fly(null, null, null, null, null, null, null);
    }
}