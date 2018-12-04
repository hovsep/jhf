package chapter15.multythreading;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("In my runnable");
    }
}
