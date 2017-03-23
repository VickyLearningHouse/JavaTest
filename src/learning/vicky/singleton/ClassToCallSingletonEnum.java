package learning.vicky.singleton;


public class ClassToCallSingletonEnum {

    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
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

        /**
         * constructor can't be invoked
         */
        /*Constructor<SingletonEnum> constructor = (Constructor<SingletonEnum>) SingletonEnum.INSTANCE.getClass().getDeclaredConstructor(new Class[]{String.class, int.class});
        constructor.setAccessible(true);
        constructor.newInstance("new instance",1);*/

    }

}
