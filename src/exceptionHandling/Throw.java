package exceptionHandling;

public class Throw {
    static void checkThrowUse(int age) {
        if(age<18){
          throw new ArithmeticException("Age should greater than 18");
        }
        System.out.print("ex------->");
        // throw new ArithmeticException("devided by 0");
    }

   public static void main(String[] args){
     checkThrowUse(12);
    
   }
}

//unchecked exception
//check exception file not found exception
