import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOuputStreamEx1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("123.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos, 5); // 버퍼의 사이즈 지정가능

            for (int i = '1'; i <= '9'; i++) {
                bos.write(i);
            }
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
