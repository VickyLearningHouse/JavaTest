package learning.vicky.singleton;

public class TestStaticFieldAssignTiming {

    static {
        System.out.println("main loading...");
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance() +
                " i: " + Singleton.i + " j: " + Singleton.j);

        //twice call instance
       /* System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());*/
    }

}
