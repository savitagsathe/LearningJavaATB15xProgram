package ex_17_OOPs;

public class Lab173_default_Constructor {
    static void main(String[] args) {
        Animal dog=new Animal();
        //A1 a=new A1();
        MYSQL s=new MYSQL();
        ReadExcelFile el=new ReadExcelFile();
    }}

//class A1{//another class in same file and call constructor
//    A1(){
//        System.out.println("Default constructor");//Default constructor
//
//    }
//
//}


class MYSQL{
    MYSQL(){
        System.out.println("MysQL Connected!");
    }
}

class ReadExcelFile{
    ReadExcelFile(){
        System.out.println("Excel File is Loaded!");
    }
}
