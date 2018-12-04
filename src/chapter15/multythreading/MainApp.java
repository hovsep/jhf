package chapter15.multythreading;

public class MainApp {

    public static void main(String[] args) {
        MainApp app = new MainApp();
        app.launch();
    }

    private void launch()
    {
        MyThread t1 = new MyThread();
        t1.start();

        //This will run first, because t1 is sleeping
        MyRunnable r2 = new MyRunnable();
        Thread t2 = new Thread(r2);
        t2.start();


    }
}
