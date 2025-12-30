package ex_05_ternary_operator;
/*A user input will give you an age
      You need to check if the user is minor,adult,or senior citizen

        */
public class Lab068_Real_Age_Classification {
    public static void main(String[] args) {
    //User will give you the input via commandLine
        String age_input_string=args[0];
        System.out.println(age_input_string instanceof String);
        int age_user_input  = Integer.parseInt(age_input_string);//26
        String result=(age_user_input<18)?"Minor":(age_user_input<=60)?"Adult":"Senior Citizen";
        System.out.println(result);
    }
}
