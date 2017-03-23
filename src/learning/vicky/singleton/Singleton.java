package learning.vicky.singleton;


public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("init");
    }

    public static Singleton getInstance() {
        return instance;
    }
}