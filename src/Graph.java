import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Graph {
    private boolean[][] graphMatrix;
    private Airport[] airports;

    public Graph(int cantAirports) {
        airports = AuxiliaryFunctions.generateAirports(cantAirports);
        this.graphMatrix = new boolean[cantAirports][cantAirports];
        assignAirportsConnections();
    }

    public Graph(Airport[] airports) {
        int size = airports.length;
        this.airports = airports;
        this.graphMatrix = new boolean[size][size];
        assignAirportsConnections();
    }

    private void findPositionOnList(int posList, ArrayList<String> connections, Airport[] airports) {
        List<String> airportNames = new ArrayList<>();
        for (Airport airport: airports) {
            airportNames.add(airport.getCity());
        }

        for (int i = 0; i < connections.size(); i++) {
            int compare = airportNames.indexOf(connections.get(i));
            if (compare != -1) {
                addEdge(posList, compare);
            }
        }
    }

    private void addEdge(int x, int y) {
        this.graphMatrix[x][y] = true;
    }

    private void assignAirportsConnections() {
        int sizeMatrix = graphMatrix.length;
        for (int i = 0; i < sizeMatrix ; i++) {
            ArrayList<String> connections = airports[i].getConnections();
            findPositionOnList(i, connections, airports);
        }
    }

    public List<FlightPlan> calculateFlightPlanByAirplane() {
        List<FlightPlan> res = new ArrayList<>();
        List<Airplane> airplanes = new ArrayList<>();
        for (Airport airport: airports) {
            for (Airplane airplane: airport.getAirplanes()) {
                airplanes.add(airplane);
            }
        }

        //Eliminamos duplicados
        Set<Airplane> hashSet = new HashSet<>(airplanes);
        airplanes.clear();
        airplanes.addAll(hashSet);


        return res;
    }


    public void printGraph() {
        int rows = graphMatrix.length;
        int columns = graphMatrix[0].length;
        String str = "|\t\t";
        String strTitle = "|\t";
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                strTitle += airports[j].getName() + "\t";
            }
            if(i==0) {
                System.out.println(strTitle + "|");
            }
                for(int j=0;j<columns;j++){
                    str += graphMatrix[i][j] + "\t\t";
                }
                System.out.println(str + "|");
                str = "|\t\t";
        }
    }
}