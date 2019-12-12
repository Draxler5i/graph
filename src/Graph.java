import java.util.List;

public class Graph {
    private boolean[][] graphMatrix;
    private Airport[] airports;
    private int numVertex;

    public Graph(int cantAirports) {
        airports = AuxiliaryFunctions.generateAirports(cantAirports);
        this.graphMatrix = new boolean[cantAirports][cantAirports];
        this.numVertex = cantAirports;
        assignAirportsConnections();
    }

    private void assignAirportsConnections() {
        int sizeMatrix = this.graphMatrix.length;
        for (int i = 0; i < sizeMatrix ; i++) {

        }
    }
}