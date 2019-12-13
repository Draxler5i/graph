import java.util.*;

public class Main {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int cantAirports = 2;//sc.nextInt();
//        Airport[] airports = AuxiliaryFunctions.generateAirports(cantAirports);
//        Airport a1 = airports[0];
//        Airport a2 = airports[1];
//        System.out.println("1.- \n" +a1.toString());
//        System.out.println("2.- \n" +a2.toString());
//        boolean[][] a = {{true, false}, {false, true}};
//        int rows = a.length;
//        int columns = a[0].length;
//        String str = "|\t";
//
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<columns;j++){
//                str += a[i][j] + "\t";
//            }
//            System.out.println(str + "|");
//            str = "|\t";
//        }
//        List <String> numbers = new ArrayList<>();
//        numbers.add("Hello");
//        numbers.add("World");
//        numbers.add("LA");
//        numbers.add("No name");
//
//        Optional<String> value = numbers
//                .stream()
//                .filter(a -> a == "LA")
//                .findFirst();

        Graph graph = new Graph(cantAirports);
        Airport[] airports1 = graph.getAirports();
        for (int i=0; i<airports1.length; i++) {
            System.out.println((i+1)+".-"+airports1[i].toString());
        }
        graph.printGraph();
        System.out.println("Hello World!");
    }
}
