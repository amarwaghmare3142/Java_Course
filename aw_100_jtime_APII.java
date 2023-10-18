import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class aw_100_jtime_APII {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

    }
}
