package chapter15.concurency;

public class ConcurrencyApp implements Runnable {


    public static void main(String[] args) {
        String[] threadNames = {"Hovsep", "Vita", "Kira"};

        for (int j = 0; j < 3; j++) {
            ConcurrencyApp runnable = new ConcurrencyApp();
            Thread t = new Thread(runnable);
            t.setName(threadNames[j]);
            t.start();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep((long) Math.random() * 1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " is running iteration " + i);
        }

        System.out.println(Thread.currentThread().getName() + " is finished");
    }
}
