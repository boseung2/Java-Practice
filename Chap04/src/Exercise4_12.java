public class Exercise4_12 {
    public static void main(String[] args) {
        for(int i=1; i<=3; i++) {
            for(int j=1; j<=3; j++) {
                int n = 3 * i;
                System.out.print((n - 1) + "*" + j + "=" + (n - 1) * j + "\t");
                System.out.print(n + "*" + j + "=" + n * j + "\t");
                System.out.println((n + 1) + "*" + j + "=" + (n + 1) * j);
            }
            System.out.println();
        }
    }
}
