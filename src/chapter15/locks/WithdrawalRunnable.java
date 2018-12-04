package chapter15.locks;

public class WithdrawalRunnable implements Runnable {

    private BankAccount account;

    private double amount = 0;

    public WithdrawalRunnable(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
            for (int i = 1; i <= 10;i++) {
                this.getSomeCash();
            }

    }

    private synchronized void getSomeCash()
    {
        if (this.account.getBalance() >= this.amount) {
            System.out.println(Thread.currentThread().getName() + " thread is about withdraw");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }

            this.account.withdrawal(this.amount);
        } else {
            System.out.println("Sorry, no enough money for " + Thread.currentThread().getName() + " thread");
        }

        if (this.account.getBalance() < 0) {
            System.out.println("Overdraft in " + Thread.currentThread().getName() + " thread");
        }
    }
}
