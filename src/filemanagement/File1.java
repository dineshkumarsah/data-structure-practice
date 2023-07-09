package filemanagement;
import java.io.*;

public class File1 {
   public static void main(String[] args){
    try{
      File f=new File("src\\filemanagement\\files\\two.txt");
      if(f.createNewFile()){
        System.out.println("File cretaed");
      }else{
         System.out.println("File not cretaed");
      }
    }catch(IOException e){
      System.out.print("exception");
      e.printStackTrace();
    }
   
   }  
}
