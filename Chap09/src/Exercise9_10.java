public class Exercise9_10 {

    public static String format(String str, int length, int allignment) {
        if (length < str.length()) {
            return str.substring(0, length);
        }

        char[] charArr = new char[length];
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = ' ';
        }
        if(allignment == 0){
            System.arraycopy(str.toCharArray(), 0, charArr, 0, str.length());
        }
        if(allignment == 1){
            System.arraycopy(str.toCharArray(), 0, charArr, (charArr.length - str.length()) / 2, str.length());
        }
        if(allignment == 2){
            System.arraycopy(str.toCharArray(), 0, charArr, charArr.length - str.length(), str.length());
        }
        return new String(charArr);
    }


    public static void main(String[] args) {
        String str = "가나다";
        System.out.println(format(str,7,0));
        System.out.println(format(str,7,1));
        System.out.println(format(str,7,2));
    }
}
