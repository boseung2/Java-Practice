import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class Exercise10_5 {
    static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
        int dayDiff = 0;
        if(yyyymmdd1 == null || yyyymmdd2 == null) {
            return 0;
        }
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        try {
            Calendar d1 = Calendar.getInstance();
            Calendar d2 = Calendar.getInstance();
            d1.setTime(df.parse(yyyymmdd1));
            d2.setTime(df.parse(yyyymmdd2));
            dayDiff = (int) ((d1.getTimeInMillis() - d2.getTimeInMillis()) / (1000 * 60 * 60 * 24));
        } catch (ParseException e) { }
        return dayDiff;
    }

    public static void main(String[] args){
        System.out.println(getDayDiff("20010103","20010101"));
        System.out.println(getDayDiff("20010103","20010103"));
        System.out.println(getDayDiff("20010103","200103"));
    }
}

