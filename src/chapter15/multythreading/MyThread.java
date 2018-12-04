package chapter15.multythreading;

public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            sleep(1000);
        } catch (Exception ie) {
            ie.printStackTrace();
        }

        System.out.println("In my thread " + this.getName());
    }
}
