package filemanagement;
import java.io.FileWriter;
import java.io.IOException;


public class FileAppendText {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "\\src\\filemanagement\\files\\xx.txt";
        String txt = "dinesh Sah";
        try {
          FileWriter fw = new FileWriter(path, true);
            fw.write(txt);
            fw.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
