package exceptionHandling;

public class CustomException extends Exception {
    CustomException(String str){
        super(str);
    }

    public static void validateAge(int age) throws CustomException{
        if(age<18){
           throw new CustomException("Age should greater than 18");
        }else{
           System.out.println("welcome to vote");   
        }
    }

    public static void main(String[] args){
        try{
            validateAge(12);
        }catch(CustomException cE){
            System.out.println("welcome to vote=========>"+cE);   
        }
    }
}
