package ex_22_OOPS_AccessModifier.police;

public class Rahul extends Cop{

    public Rahul(int gun) {
        super(gun);
    }

   public static void main(String[] args) {
Cop rahul=new Cop(10);
rahul.canIShoot();
rahul.thisDefaultF1();

    }
}
