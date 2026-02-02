package ex_21_OOPS_encapsulation;

public class Lab192_REAL_BANK {
    static void main(String[] args) {
ICICIBank amit=new ICICIBank("amit",100);
long bal=amit.getBalance();
        System.out.println(bal);

        //can amit directly access bal=>no
        //System.out.println(amit.bal);
        //but he can access directly by using setbal and getbal method.so he can hack it.in this case setbal should check is he cashier or not
       // amit.setBalance(100);
        System.out.println(amit.getBalance());


    }
}

class ICICIBank{
    private String name;
    private long balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }


    public void setBalance(long balance,boolean isCashier) {
        if(isCashier) {
            this.balance = balance;
        }
        else{
            System.out.println("Not allowed to modify the balance");
        }
    }

    public ICICIBank(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }
}

