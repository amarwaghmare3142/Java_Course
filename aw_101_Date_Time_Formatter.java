import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class aw_101_Date_Time_Formatter {
    public static void main(String[] args) {
        LocalDate dt = LocalDate.now();
        System.out.println(dt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E");
        String myDate = dt.format(dtf);
        System.out.println(myDate);

        DateTimeFormatter x = DateTimeFormatter.ISO_DATE;
        String a = dt.format(x);
        System.out.println(a);
    }

}
