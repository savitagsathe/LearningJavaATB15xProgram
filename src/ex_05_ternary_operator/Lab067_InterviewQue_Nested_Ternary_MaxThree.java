package ex_05_ternary_operator;

public class Lab067_InterviewQue_Nested_Ternary_MaxThree {
    public static void main(String[] args) {
      /*Find out max out of three using ternary operator:
      int n1=2;
       int n2=9;
       int n3=-11;
        System.out.println("max out of three");
        */
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        String max = (n1 > n2 && n1 > n3) ? "n1 is max: " + n1 : (n2 > n3) ? "n2 is max: " + n2 : "n3 is max: " + n3;
        System.out.println(max);
    }
}
