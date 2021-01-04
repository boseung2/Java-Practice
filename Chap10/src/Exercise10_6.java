import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercise10_6 {
    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(1997, 8, 7);
        LocalDate today = LocalDate.now();

        long day = birthDay.until(today, ChronoUnit.DAYS);
        System.out.println(day + " days");
    }
}
