package coding_250questions_practice;

public class Palidrome_of_String {
    static void main(String[] args) {
        String s="madam";
        String rev="";
        for(int i=1;i<=s.length();i++){
            rev=rev+s.charAt(s.length()-i);
        }
        if (s.equalsIgnoreCase(rev)){
            System.out.println(rev+":is Plaindrome");
        }
        else {
            System.out.println(rev+":is not plindrome");
        }
    }
}
