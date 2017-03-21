package learning.vicky.singleton;

public class SingleImpSerilizaiton {

    private static SingleImpSerilizaiton instance = new SingleImpSerilizaiton();

    private SingleImpSerilizaiton() {
    }

    public static SingleImpSerilizaiton getInstance() {
        return instance;
    }
}