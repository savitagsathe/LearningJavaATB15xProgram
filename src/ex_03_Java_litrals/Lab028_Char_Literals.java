package ex_03_Java_litrals;

public class Lab028_Char_Literals {
    static void main() {
    char c1='A';
    //A-Z a-z @#$$%%^&&*(())_+!
        //char c="A";//not a char it become string

        char c2='B';
        System.out.println(c2);//output will be B

        char c3='@';
        char c4='%';
        char c5='^';
        char c6='&';
        char c7='*';
        char c8=' ';//blank space
   //Escape sequence
        char new_line='\n';
        char tab_line='\t';
        char back_space='\b';
        char carriage_return='\r';

        System.out.println("savita"+new_line+" sathe");//add new line after savita
                                                                           // sathe

        System.out.println("savita"+tab_line+" sathe");//add space after savita	 sathe
        System.out.println("savita"+back_space+" sathe");//remove a from :savit sathe
        System.out.println("savita"+carriage_return+" sathe");//removed previous word savita:  sathe
    //char is integer integral
        char c10='A';
        //ASCII(limited numbers)-A->65

       // char rupees='';//can have rupee character also
        //can have smiley character also
        char smiley='\u1f60';
        System.out.println(smiley);


        int binary=0b1010;
        int hex =0xFF;
        long amount=1_00_000L;//it will accept underscore instead of , and space
        System.out.println(amount);
    }
}
