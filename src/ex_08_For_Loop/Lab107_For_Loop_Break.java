package ex_08_For_Loop;

public class Lab107_For_Loop_Break {
    static void main(String[] args) {
//for(int i=0;i<50;i++)  //0 to 49 50 times it will run
//{
//    System.out.println(i);//output:0 1 2 3 4 5 End
//    if (i==5){
//        break;
//    }
//}
//        System.out.println("End");

        //if we change the order of print statement
        for(int i=0;i<50;i++)  //0 to 49 50 times it will run
        {

            if (i==5){
                break;
            }
            System.out.println(i);//output:0 1 2 3 4  End
        }
        System.out.println("End");
    }
}
