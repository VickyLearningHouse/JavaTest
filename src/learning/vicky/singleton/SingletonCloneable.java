package learning.vicky.singleton;

import java.util.Date;

public class SingletonCloneable implements Cloneable {

    private static SingletonCloneable instance = new SingletonCloneable();
    private Date today;

    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }

    private SingletonCloneable(){}

    public static SingletonCloneable getInstance(){
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
