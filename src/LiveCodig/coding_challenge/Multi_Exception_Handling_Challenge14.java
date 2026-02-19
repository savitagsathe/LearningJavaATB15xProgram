package LiveCodig.coding_challenge;

import org.w3c.dom.ls.LSOutput;

/*
Multi-Exception Handling
Implement exception handling for a program that divides two numbers and catches ArithmeticException, NumberFormatException, and ArrayIndexOutOfBoundsException.

Examples:
Input:Division by zero, invalid number format, array index out of bounds
Output:ArithmeticException: Cannot divide by zero NumberFormatException: Invalid number format ArrayIndexOutOfBoundsException: Array index out of bounds
💡 Explanation:Multiple catch blocks can handle different types of exceptions that might occur in a try block.

*/
public class Multi_Exception_Handling_Challenge14 {



    static void main(String[] args) {
       try{
           // 1️⃣ NumberFormatException
           int num=Integer.parseInt("abc");

           // 2️⃣ ArrayIndexOutOfBoundsException
           int[]arr={10,34,6};
           System.out.println(arr[5]);

           // 3️⃣ ArithmeticException
           int result=10/0;
           System.out.println(result);
       } catch (ArithmeticException  e) {
           System.out.println("ArithmeticException: Cannot divide by zero");
       }catch (NumberFormatException e){
           System.out.println("NumberFormatException: Invalid number format");
       }catch (NullPointerException e){
           System.out.println("ArrayIndexOutOfBoundsException: Array index out of bounds");
       }

    }
}
/*
Only one exception executes at a time.
In above code:int num1 = Integer.parseInt("abc");
This line throws NumberFormatException first,
so remaining code inside try block will NOT execute.
 */
//Soulution 2 to print above output

// ArithmeticException
/*public class Multi_Exception_Handling_Challenge14 {



    static void main(String[] args) {
        try {
        int result = 10 / 0;
        } catch (ArithmeticException e) {
        System.out.println("ArithmeticException: Cannot divide by zero");
        }

                // NumberFormatException
                try {
        int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
        System.out.println("NumberFormatException: Invalid number format");
        }

                // ArrayIndexOutOfBoundsException
                try {
        int[] arr = {10, 20, 30};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("ArrayIndexOutOfBoundsException: Array index out of bounds");
        }
                }
                }
*/