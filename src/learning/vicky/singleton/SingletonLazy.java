package learning.vicky.singleton;

public class SingletonLazy {
//  private static SingletonLazy instance = null;
    private SingletonLazy() {
    }

    private static class LazyHolder {
        private static final SingletonLazy instance = new SingletonLazy();
    }

    public static SingletonLazy getInstance() {
        /*synchronized(SingletonLazy.class){
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }*/

    /*if(instance == null){
        synchronized(SingletonLazy.class){
            //this check incase one thread is already waiting
            if (instance == null) {
                instance = new SingletonLazy();
            }
        }
    }
    return instance;*/
        return LazyHolder.instance;
    }

    /*// 不添加该方法则会出现 反序列化时出现多个实例的问题
    public Object readResolve() {
        return instence;
    }*/
}
