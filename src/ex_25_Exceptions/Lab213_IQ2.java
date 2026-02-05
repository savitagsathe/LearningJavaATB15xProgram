package ex_25_Exceptions;

public class Lab213_IQ2 {
    public static void main(String[] args) {
//        System.out.println("Starting the program");
//        String input_user=args[0];//ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//        Integer a=Integer.parseInt(input_user);//NumberFormatException: For input string: "savita"
//        Integer output=100/a;  //ArithmeticException: / by zero  (if enter 0 value of a)
//        System.out.println(output);
//        System.out.println("End of the program");
//The above programs 3 exception will be handled in one


        try {
            String input_user=args[0];
            Integer a=Integer.parseInt(input_user);
            int output = 100/a;
        } catch (ArrayIndexOutOfBoundsException|ArithmeticException|NumberFormatException e) {
            System.out.println(e.getMessage());
        }


    }
}
