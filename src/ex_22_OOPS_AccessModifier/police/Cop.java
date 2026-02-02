package ex_22_OOPS_AccessModifier.police;

public class Cop {
    private int gun;
   private String iCard;

    public Cop(int gun){
        this.gun=gun;
    }
  protected void canIShoot(){
        System.out.println("Yes you can!!");
    }
    void thisDefaultF1(){
        System.out.println("Hi,Cop!");
    }
}
