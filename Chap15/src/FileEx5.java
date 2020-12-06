import java.io.File;
import java.util.Comparator;

public class FileEx5 {
    public static void main(String[] args) {
        if (args.length != 1 || args[0].length() != 1 || "tTlLnN".indexOf(args[0]) == -1) {
            System.out.println("USAGE : java FileEx5 SORT_OPTION    ");
            System.out.println("    SORT_OPTION :                   ");
            System.out.println("    t   Time ascending sort.        ");
            System.out.println("    T   Time descending sort.        ");
            System.out.println("    l   Length ascending sort.        ");
            System.out.println("    L   Length descending sort.        ");
            System.out.println("    n   Name ascending sort.        ");
            System.out.println("    N   Name descending sort.        ");
            System.exit(0);
        }

        final char option = args[0].charAt(0);

        String currDir = System.getProperty("user.dir");
        File dir = new File(currDir);
        File[] files = dir.listFiles();

        Comparator comp = new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }


        };


    }
}
