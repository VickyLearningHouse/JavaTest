package learning.vicky.singleton;

public class SubClassOfSingleton extends Singleton {
    static {
        System.out.println("SubClassOfSingleton loading");
    }

    static String str = "Hello World";
    public SubClassOfSingleton(){
        System.out.println("SubClassOfSingleton initializing ");
        i = 3;
    }
}
