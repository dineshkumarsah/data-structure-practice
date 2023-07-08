package exceptionHandling;
import java.io.*;

public class Throws {

    static void method() throws FileNotFoundException{
     FileReader rd= new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");
     BufferedReader br=new BufferedReader(rd, 0);
     throw new FileNotFoundException();
    }

    public static void main(String[] args){
        try{
          method();
        }catch(FileNotFoundException e){

        }
          System.out.println("rest of the code...");    
    }
    
}
