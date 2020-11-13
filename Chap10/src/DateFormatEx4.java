import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateFormatEx4 {
    public static void main(String[] args) {
        String pattern = "yyyy/MM/dd";
        DateFormat df = new SimpleDateFormat(pattern);
        Scanner scanner = new Scanner(System.in);

        Date inDate = null;

        while (scanner.hasNextLine()) {
            try {
                inDate = df.parse(scanner.nextLine());
                break;
            } catch (ParseException e) {
                System.out.println("날짜를 " + pattern + "의 형태로 다시 입력해주세요.(입력예:2015/12/31)");
            }
        }

            Calendar cal = Calendar.getInstance();
            cal.setTime(inDate);
            Calendar today = Calendar.getInstance();
            long day = (cal.getTimeInMillis() - today.getTimeInMillis()) / (60 * 60 * 1000);
            System.out.println("입력하신 날짜는 현재와 " + day + "시간 차이가 있습니다.");

    }
}
