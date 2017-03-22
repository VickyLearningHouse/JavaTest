package learning.vicky.singleton;

public enum SingletonEnum {
    INSTANCE;

    public void print() {
        System.out.println(Thread.currentThread().getName() + " is working! Instance name:  " + this.toString()
                + this.hashCode());
    }

    @Override
    public String toString() {
        return "[singleton instance]";
    }
}
