package learning.vicky.singleton;



public class Singleton {


    static int i = 0;
    static{
        System.out.println("Singleton loading");
    }
    private static Singleton instance = new Singleton(4);
    static int j = 99;

    public Singleton() {
        System.out.println("init");
        i = 2;
    }

    public Singleton(int k){
        i = k;
        j = k;
        System.out.println("Singleton: " + Thread.currentThread().getStackTrace().toString());
    }

    public static Singleton getInstance() {
        System.out.println("getInstantce");
        return instance;
    }

    // 不添加该方法则会出现 反序列化时出现多个实例的问题
   /* public Object readResolve() {
        return instance;
    }*/
}