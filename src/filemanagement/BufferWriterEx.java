package filemanagement;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class BufferWriterEx {
   public static void main(String[] args){
    try{
       FileWriter file =new FileWriter("src//filemanagement//files//xx.txt");
       BufferedWriter bf=new BufferedWriter(file);
       bf.write("here is buffer writedddd");
       bf.close();
    }catch(IOException e){
        e.getStackTrace();
    }
   
   } 
}
