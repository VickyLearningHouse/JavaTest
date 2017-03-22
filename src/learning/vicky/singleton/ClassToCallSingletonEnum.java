package learning.vicky.singleton;

public class ClassToCallSingletonEnum {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonEnum.INSTANCE.print();
            }
        }, "Printer A");
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonEnum.INSTANCE.print();
            }
        }, "Printer B");

        thread1.start();
        thread2.start();
    }

}
