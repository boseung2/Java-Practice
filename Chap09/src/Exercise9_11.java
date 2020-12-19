public class Exercise9_11 {
    public static void main(String[] args) {
        if (Integer.parseInt(args[0]) < 2 || Integer.parseInt(args[0]) > 9) {
            System.out.println("단의 범위는 2와 9사이의 값이어야 합니다.");
        }
        if (Integer.parseInt(args[1]) < 2 || Integer.parseInt(args[1]) > 9) {
            System.out.println("단의 범위는 2와 9사이의 값이어야 합니다.");
        }
        for(int i=Integer.parseInt(args[0]); i<=Integer.parseInt(args[1]); i++){
            printGugudan(i);
        }

    }

    public static void printGugudan(int n) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(n + "*" + i  + "=" + n*i);
        }
        System.out.println();
    }
}
