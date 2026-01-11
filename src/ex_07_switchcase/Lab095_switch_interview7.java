package ex_07_switchcase;

public class Lab095_switch_interview7 {
    static void main(String[] args) {
        //what is the output for this?=>
        /*output:
        Helloooooooooo
        65
        here default dont have break so it will execute default followed by case 'A'*/
      char code='c';

        switch (code){
            default:System.out.println("Helloooooooooo");

            case 'A':
                System.out.println("65");
            break;
            
            case 'B':System.out.println("66");
            break;



        }
    }
}