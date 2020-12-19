public class Exercise9_9 {

    public static String delChar(String src, String delCh) {
        StringBuffer source = new StringBuffer(src);
        for (int i = 0; i < source.length(); i++) {
            for (int j = 0; j < delCh.length(); j++) {
                if (source.charAt(i) == delCh.charAt(j)) {
                    source.deleteCharAt(i);
                }
            }
        }
        return new String(source);
    }


    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
        System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)", " \t"));

    }
}
