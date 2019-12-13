import java.util.ArrayList;
import java.util.Arrays;

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

    public Airport[] getAirports() {
        return airports;
    }

    private void fillGraphMatrix(ArrayList<Integer> position) {
        for (int i = 0; i < position.size(); i++) {
            int posXY = position.get(i);
            this.graphMatrix[posXY][posXY] = true;
        }
    }

//    private ArrayList<String> getNameConnections(Airport airport) {
//        ArrayList<String> res = new ArrayList<>();
//        for (int i = 0; i < airport.getConnections().size(); i++) {
//            res.add(airport.getConnections().get(i));
//        }
//        return  res;
//    }

    private ArrayList<Integer> findPositionOnList(ArrayList<String> connections, Airport[] airports) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < connections.size(); i++) {
            if (connections.get(i) == airports[i].getCity()) {
                res.add(i);
            }
        }
        return res;
    }

    private void assignAirportsConnections() {
        int sizeMatrix = graphMatrix.length;
        for (int i = 0; i < sizeMatrix ; i++) {
//            ArrayList<String> connections = getNameConnections(airports[i]);
            ArrayList<String> connections = airports[i].getConnections();
            ArrayList<Integer> positionList = findPositionOnList(connections, airports);
            fillGraphMatrix(positionList);
            System.out.println("****************************************");
            System.out.println("Airport: "+ airports[i].getName());
            System.out.println("Connections: "+ connections.toString());
            System.out.println("positionList: "+ positionList.toString());
            System.out.println("position Global\n");
            printGraph();
            System.out.println("****************************************");
        }
    }

    @Override
    public String toString() {
        return "Graph{" +
                "graphMatrix=" + Arrays.toString(graphMatrix) + //Not work
                '}';
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