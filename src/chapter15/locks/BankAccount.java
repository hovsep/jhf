package chapter15.locks;

public class BankAccount {

    private double balance = 0;


    public BankAccount(double balance) {
        this.balance = balance;
    }

    /**
     *
     * @return
     */
    public synchronized double getBalance() {
        return balance;
    }


    /**
     *
     * @param amount
     */
    public synchronized void withdrawal(double amount) {
        this.balance -= amount;
        System.out.println("Balance is " + balance);
    }
}
