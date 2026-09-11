import java.util.Scanner;
public class AgeValidation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");         
        int age =sc.nextInt();
        try{
            agecheck(age);}
        catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    static void agecheck(int age) throws InvalidAgeException {
        if(age<18) {
            throw new InvalidAgeException(" ouu shii (if you female)");
        }
        else {
            System.out.println("Welcome to vote");
        }
    }
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String s){
        super(s);
    }
}
