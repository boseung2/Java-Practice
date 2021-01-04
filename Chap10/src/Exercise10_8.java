import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exercise10_8 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        ZonedDateTime seoulTime = dt.atZone(ZoneId.of("Asia/Seoul"));
        ZonedDateTime newYorkTime = ZonedDateTime.now().withZoneSameInstant((ZoneId.of("America/New_York")));

        System.out.println(seoulTime);
        System.out.println(newYorkTime);

        int a, b;
        System.out.println(a = seoulTime.getHour());
        System.out.println(b = newYorkTime.getHour());

        System.out.println(Math.abs(a - b) + " hrs");

    }
}
