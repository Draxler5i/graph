import java.util.*;

public class Main {

    public static void main(String [] args) {
        Airport[] airports = AuxiliaryFunctions.get3airports();
        Graph graph = new Graph(airports);
        System.out.println("*********************************Graph*********************************");
        graph.printGraph();
        System.out.println("*********************************Output*********************************");
        List<FlightPlan> flightByAirplane = graph.calculateFlightPlanByAirplane();
//        graph.printFlightPlan();
    }
}
