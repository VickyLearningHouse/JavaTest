package learning.vicky.singleton;

public class MultiThreadCallSingletonLazy extends Thread{

    /**
     * sometimes will get different instance
     * @param args
     */
    public static void main(String[] args) {
        MultiThreadCallSingletonLazy[] threads = new MultiThreadCallSingletonLazy[90000];
        for(int i=0; i<90000; i++){
            threads[i] = new MultiThreadCallSingletonLazy();
        }

        for(int i=0; i<90000; i++){
            threads[i].start();
            threads[++i].start();
        }
    }

    @Override
    public void run(){
        SingletonLazy instance = SingletonLazy.getInstance();
        System.out.println(instance.hashCode());
    }

}
