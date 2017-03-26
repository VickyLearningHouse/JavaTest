package learning.vicky.singleton;


public class SingletonInnerStaticHoldInstance {
    private SingletonInnerStaticHoldInstance() {
    }

    static{
        System.out.println("Singleton class loading...");
    }
    static int i = 2;

    private static class LazyHolder {
        static{
            System.out.println("static inner class loading...");
        }

        private static final SingletonInnerStaticHoldInstance instance = new SingletonInnerStaticHoldInstance();
    }
    public static SingletonInnerStaticHoldInstance getInstance() {
        return LazyHolder.instance;
    }
}
