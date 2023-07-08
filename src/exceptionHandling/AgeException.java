package exceptionHandling;

public class AgeException {
     void ageCheck(int num){
        try{
         int result = num/0; //java.lang.ArithmeticException: / by zero
        }catch(Exception e){
            System.out.println("Exception occuring");
        }
    }
    public static void main(String[] args){
       AgeException obj = new AgeException(); 
       obj.ageCheck(12);
       System.out.println("123");
    }
}
