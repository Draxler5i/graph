import java.util.List;

public class Main {

    public static void main(String [] args) {
        Airport[] airports = AuxiliaryFunctions.getStaticAirports();
        Graph graph = new Graph(airports);
        System.out.println("*********************************Graph*********************************");
        graph.printGraph();
        System.out.println("*********************************Output*********************************");
        List<FlightPlan> flightByAirplane = graph.calculateFlightPlanByAirplane();
        System.out.println("Size "+ flightByAirplane.size());
        for (FlightPlan flight: flightByAirplane) {
            System.out.println("Flight plan: \n" + flight);
        }
//        graph.printFlightPlan();
    }
}
