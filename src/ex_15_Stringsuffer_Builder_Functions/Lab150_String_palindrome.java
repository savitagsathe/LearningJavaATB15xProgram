package ex_15_Stringsuffer_Builder_Functions;

public class Lab150_String_palindrome {
    static void main(String[] args) {
        String s="madam";
        String rev="";//if we give space here it will give "not a palindrome" bcoz space wil consider
        for(int i=1;i<=s.length();i++){

            rev= rev+(s.charAt(s.length()-i));
        }
        if(rev.equalsIgnoreCase(s)){
            System.out.println(rev+": is a palindrome string");
        }else {
            System.out.println(rev+": is not a palindrome string");
        }
    }
}
