import java.util.Date;

public class Fly {

    private Airplane airplane;
    private Location origin;
    private Location destiny;
    private String boardingTime;
    private Date date;
    private FlyStateEnum state;
    private String timeFly;

    public Fly(Airplane airplane, Location origin, Location destiny, String boardingTime, Date date, FlyStateEnum state, String timeFly) {
        this.airplane = airplane;
        this.origin = origin;
        this.destiny = destiny;
        this.boardingTime = boardingTime;
        this.date = date;
        this.state = state;
        this.timeFly = timeFly;
    }
}
