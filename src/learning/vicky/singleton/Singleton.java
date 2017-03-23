package learning.vicky.singleton;

import java.io.Serializable;


public class Singleton implements Serializable{

    private static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("init");
    }

    public static Singleton getInstance() {
        return instance;
    }

    // 不添加该方法则会出现 反序列化时出现多个实例的问题
   /* public Object readResolve() {
        return instance;
    }*/
}