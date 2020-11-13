import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {
    public static void main(String[] args) {
        String[] starArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(starArr);
        System.out.println("strArr=" + Arrays.toString(starArr));

        Arrays.sort(starArr, String.CASE_INSENSITIVE_ORDER);
        System.out.println("strArr=" + Arrays.toString(starArr));

        Arrays.sort(starArr, new Descending());
        System.out.println("strArr=" + Arrays.toString(starArr));


    }
}

class Descending implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Comparable && o2 instanceof Comparable){
            Comparable c1 = (Comparable)o1;
            Comparable c2 = (Comparable)o2;
            return c1.compareTo(c2)*-1;
        }
        return -1;
    }
}