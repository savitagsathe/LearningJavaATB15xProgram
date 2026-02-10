package ex_26_Enum;

public class Lab220_ENUM_P3 {
    static void main(String[] args) {
        System.out.println(HEX_CODES.BLUE.getHexcode());




}
//in automation we want to store the hex code of color
enum HEX_CODES{
    RED("#FF0000"),
    GREEN("#008000"),
    BLUE("#0000FF"),
    YELLOW("#FFFF00");

    private String hexcode;

    HEX_CODES(String hexcode) {
   this.hexcode=hexcode;
    }
    String getHexcode(){
        return this.hexcode;
    }
}}