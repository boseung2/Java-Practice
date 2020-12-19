public class Exercise9_12 {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++)
            System.out.print(getRand(1, -3) + ",");
    }

    public static int getRand(int from, int to) {
        if (Math.min(from, to) == to) {
            int tmp = from;
            from = to;
            to = tmp;
        }
        return (int)(Math.random() * (Math.abs(to - from) + 1)) + from;
    }

}
