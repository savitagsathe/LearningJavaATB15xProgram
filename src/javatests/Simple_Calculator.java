package javatests;

/*Write a Java program to perform addition, subtraction, multiplication, or division based on user choice using a switch statement.*/

public class Simple_Calculator {
    static void main(String[] args) {
        int num1=10, num2=5;
        char choice= '*';

        switch(choice){
            case '+' :
                System.out.println(num1+num2);
                break;

            case '-' :
                System.out.println(num1-num2);
                break;

            case '*' :
                System.out.println(num1*num2);
                break;

            case '/' :
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid operator");
        }

    }
}
