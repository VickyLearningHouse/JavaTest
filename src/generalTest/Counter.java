package generalTest;

public class Counter {

    public static volatile int count = 0;

    public static void inc() {

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }
        count++;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Counter.inc();
                }
            }).start();
        }
        System.out.println("results:Counter.count=" + Counter.count);
    }

}
