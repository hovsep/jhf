package chapter12.InnerClass;

public class CallInnerClassFromAnotherClass {

    public static void main(String[] args) {
        OuterClass.InnerClass ic = (new OuterClass()).new InnerClass();
    }
}
