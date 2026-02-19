package LiveCodig.coding_challenge;

public class BankAccount_Challenge4 {
    /*
    Bank Account Encapsulation
  Create a BankAccount class with private balance field. Implement deposit(), withdraw(), and getBalance() methods with proper validation.

Examples:
Input:
Initial balance: 1000, deposit: 500, withdraw: 200
Output:
Balance after deposit: 1500.0 Balance after withdrawal: 1300.0
     */
    private double balance;

    public static void main(String[] args) {
        BankAccount_Challenge4 b = new BankAccount_Challenge4();
        b.setBalance(1000);
        b.deposit(500);
        b.withdraw(200);
        b.getBalance();

    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Balance after deposit: " + balance);
        }

    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Balance after withdraw: " + balance);
        }

    }

    public double getBalance() {
        return balance;
    }
}
