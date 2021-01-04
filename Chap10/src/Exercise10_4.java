import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercise10_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        String day[] = {"일", "월", "화", "수", "목", "금", "토"};
        System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력예:2007/05/11)");
        System.out.print(">>");

        while (scanner.hasNextLine()) {
            try {
                Date d = df.parse(scanner.nextLine());
                System.out.println("입력하신 날짜는 " + day[d.getDay()] + "요일입니다.");
                break;
            } catch (ParseException e) {
                System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력예:2007/05/11)");
                System.out.print(">>");
            }
        }
    }
}
