package chapter12.InnerClass;

public class OuterClass {

    public int x = 0;
    private int y = 0;
    protected int z = 0;


    class InnerClass {

        private int z = 666;

        public void mutate()
        {
            x = 2;
            y = 2;
            z = 2;//Inner's z will be used
        }
    }


    private void test()
    {
        InnerClass ic = new InnerClass();
        ic.mutate();
    }

    public static void main(String[] args)
    {
        OuterClass app = new OuterClass();

        app.x = 1;
        app.y = 1;
        app.z = 1;
        app.test();

        System.out.println("x = " + app.x);
        System.out.println("y = " + app.y);
        System.out.println("z = " + app.z);

    }



}
