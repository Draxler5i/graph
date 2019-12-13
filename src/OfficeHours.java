import java.util.Arrays;

public class OfficeHours {
    private String[] days;
    private String open;
    private String close;

    public OfficeHours(String[] days, String open, String close) {
        this.days = days;
        this.open = open;
        this.close = close;
    }

    public String[] getDays() {
        return days;
    }

    public String getOpen() {
        return open;
    }

    public String getClose() {
        return close;
    }

    @Override
    public String toString() {
        return "OfficeHours{" +
                "days=" + Arrays.toString(days) +
                ", open='" + open + '\'' +
                ", close='" + close + '\'' +
                '}';
    }
}
