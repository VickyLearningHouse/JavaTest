package learning.vicky.singleton.synchronizedTest;

public class TestSynchronized_0 {
    public static void main(String[] args) {
        final TestSynchronized_0 test = new TestSynchronized_0();
        final TestSynchronized_0 testNewObject = new TestSynchronized_0();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                test.test_0();
            }
        }, "thread 1");
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                test.test_1();
            }
        }, "thread 2");
        Thread threadNewObj = new Thread(new Runnable() {
            @Override
            public void run() {
                testNewObject.test_1();
            }
        }, "thread 3");
        //thread1.start();
        thread2.start();
        threadNewObj.start(); //differ instance hold their own object lock
    }

    /**
     * test_0: object lock
     */
    public void test_0() {
        synchronized (this) {
            process();
        }
    }

    /**
     * test_1: Class lock
     */
    public void test_1() {
        synchronized (TestSynchronized_0.class) {
            process();
        }
    }

    /**
     * test_2: general method lock(object lock)
     */
    public synchronized void test_2() {
        process();
    }

    /**
     * test_3: static method lock(Class lock)
     */
    public synchronized static void test_3(){
        process();
    }

    private static void process() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " runs i = " + i);
        }
        try
        {
            Thread.sleep(500);
        } catch (InterruptedException ie) {
        }
    }

}
