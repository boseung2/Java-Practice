import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int month;
        for(month = 0; month < 12; month++) {
            cal.set(2010, month, 1);
            int FIRST_DAY = cal.get(Calendar.DAY_OF_WEEK);
            cal.add(Calendar.DATE, FIRST_DAY == 1 ? 7 : 15 - FIRST_DAY);
            Date day = cal.getTime();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(df.format(day) + "은 2번째 일요일입니다.");
        }
    }
}
