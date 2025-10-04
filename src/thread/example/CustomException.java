package thread.example;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}


public class CustomException {

    static void checkAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age under 18 ,Please try again");
        }
        else{
            System.out.println("Valid Age");
        }
    }
    public static void main(String ar[]){
        try{
            checkAge(55);
        }catch (InvalidAgeException e){
            System.out.println("Exception : "+e.getMessage());
        }

    }
}
