import java.text.DecimalFormat;
import java.text.ParseException;

public class Exercise10_3 {
    public static void main(String[] args) throws ParseException {
        String s = "123,456,789.5";
        DecimalFormat df1 = new DecimalFormat("###,###,###.#");
        DecimalFormat df2 = new DecimalFormat("#");
        DecimalFormat df3 = new DecimalFormat("#,####,####");
        Number num = df1.parse(s);

        System.out.println("data:" + s);
        System.out.println("반올림:" + df2.format(num));
        System.out.println("만단위:" + df3.format(num));
    }
}
