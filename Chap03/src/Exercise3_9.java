public class Exercise3_9 {
    public static void main(String[] args) {
        char ch = 'z';
        boolean b = !(ch <= 'a' && ch >= 'z' && ch <= 'A' && ch >= 'Z' && ch >= '9' && ch <= '0');
        System.out.println(b);
    }
}
