public class Exercise5_10 {
    public static void main(String[] args) {
        char[] abcCode =
                {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
                 '(', ')', '-', '_', '+', '=', '|', '[', ']', '{',
                 '}', ';', ':', ',', '.', '/'};
        char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        String src = "abc123";
        String result = "";
        // src charAt() result 문자열 의 문자를 으로 하나씩 읽어서 변환 후 에 저장
        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);

            if (ch >= '0' && ch <= '9') {
                result += numCode[ch - '0'];
            }

            if (ch >= 'a' && ch <= 'z') {
                result += abcCode[ch - 'a'];
            }

        }
        System.out.println("src:" + src);
        System.out.println("result:" + result);
    }
}
