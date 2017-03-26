package learning.vicky.singleton;

public class SingletonLazy {
    private static SingletonLazy instance = null;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        /*
         * synchronized(SingletonLazy.class){ if (instance == null) { instance = new SingletonLazy(); } return instance;
         * }
         */

        if (instance == null) {
            synchronized (SingletonLazy.class) {
                // this check incase one thread is already waiting
                if (instance == null) {
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }

}
