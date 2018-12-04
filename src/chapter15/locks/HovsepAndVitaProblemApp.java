package chapter15.locks;

public class HovsepAndVitaProblemApp {

    public static void main(String[] args) {
        HovsepAndVitaProblemApp app = new HovsepAndVitaProblemApp();
        app.launch();
    }

    private void launch()
    {
        BankAccount account = new BankAccount(1000);

        WithdrawalRunnable r = new WithdrawalRunnable(account, 100);
        Thread hovsep = new Thread(r);
        hovsep.setName("Hovsep");


        Thread vita = new Thread(r);
        vita.setName("Vita");

        hovsep.start();
        vita.start();
    }
}
