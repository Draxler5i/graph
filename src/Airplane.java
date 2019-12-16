public class Airplane {

    private int id;
    private String name;
    private int cantPassengers;

    public Airplane(int id, String name, int cantPassengers) {
        this.id = id;
        this.name = name;
        this.cantPassengers = cantPassengers;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCantPassengers() {
        return cantPassengers;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "\nid=" + id +
                ",\n name='" + name + '\'' +
                ",\n cantPassengers=" + cantPassengers +
                '}';
    }
}
