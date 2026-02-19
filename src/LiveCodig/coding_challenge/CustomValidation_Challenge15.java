package LiveCodig.coding_challenge;
/*
Custom Exception Implementation
Create a custom exception class "InvalidAgeException" and throw it if age is less than 18.

Examples:
Input:
validateAge(15) and validateAge(25)
Output:
InvalidAgeException: Age must be 18 or above. Provided age: 15 Age is valid: 25
💡 Explanation:Custom exceptions extend Exception class and can carry specific error information relevant to the application domain.

 */
public class CustomValidation_Challenge15 extends Exception{
    public CustomValidation_Challenge15(String message){
super(message);// Pass message to parent Exception class
    }

}
 class AgeValidator{
    public static void validateAge(int age) throws CustomValidation_Challenge15 {
        if(age<18){
            throw new CustomValidation_Challenge15 ("Age must be 18 or above. Provided age: "+age);
        }else {
            System.out.println("Age is valid: "+age);
        }
    }

 }


class Main {

    public static void main(String[] args) {

        try {
            AgeValidator.validateAge(15);
        } catch (CustomValidation_Challenge15 e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        }

        try {
            AgeValidator.validateAge(25);
        } catch (CustomValidation_Challenge15 e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        }
    }
}