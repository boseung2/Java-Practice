import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        try  {
            FileInputStream fis = new FileInputStream("Chap15\\src\\FileCopy.java");
            FileOutputStream fos = new FileOutputStream("chap15\\src\\FileCopy.bak");
            int data = 0;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
