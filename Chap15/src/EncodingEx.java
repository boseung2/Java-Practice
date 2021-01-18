import java.io.*;
import java.util.Properties;

public class EncodingEx {
    public static void main(String[] args) throws IOException {
        Properties p = System.getProperties();
        System.out.println(p.get("sun.jnu.encoding"));
        FileInputStream fis = new FileInputStream("Chap15/src/korean_euc_kr.txt");
        FileOutputStream fos  = new FileOutputStream("Chap15/src/encodingest.txt");
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "EUC-KR");
        int data = 0;
        while((data = isr.read()) != -1) {
            osw.write(data);
        }
        osw.close();
        FileInputStream fis2 = new FileInputStream("Chap15/src/korean_euc_kr.txt");
        FileOutputStream fos2 = new FileOutputStream("Chap15/src/korean_utf8.txt");
        InputStreamReader isr2 = new InputStreamReader(fis2, "EUC_KR");
        OutputStreamWriter osw2 = new OutputStreamWriter(fos2, "UTF-8");
        data = 0;
        while((data = isr2.read()) != -1) {
            osw2.write(data);
        }
        osw2.close();
    }
}
