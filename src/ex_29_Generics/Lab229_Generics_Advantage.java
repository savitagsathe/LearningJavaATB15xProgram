package ex_29_Generics;

public class Lab229_Generics_Advantage {
    static void main(String[] args) {
//Advantage of generic is we can acees any data type by creating one generic
        temp(1,2);
        temp("most","Wonderful");
        temp(3.14,2.14);
    }
    static<savita>savita temp(savita a,savita b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
