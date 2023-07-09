package filemanagement;

import java.io.FileWriter;
import java.io.IOException;

public class WriteContentToFile {
    public static void main(String[] args){
        try{
          FileWriter fw=new FileWriter("src//filemanagement//files//xx.txt");
          fw.write("Hellow dinesh");
          System.out.print("Wrote the file SuccessFully");
          fw.close();
        }catch(IOException e){
            e.getStackTrace();
        }
 

    }
    
}
