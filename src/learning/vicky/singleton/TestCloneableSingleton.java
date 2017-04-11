package learning.vicky.singleton;

import java.util.Date;

public class TestCloneableSingleton {

    public static void main(String[] args) throws CloneNotSupportedException {

        SingletonCloneable instance = SingletonCloneable.getInstance();
        instance.setToday(new Date());
        System.out.println(instance);
        SingletonCloneable clonedInstance =  (SingletonCloneable) instance.clone();
        System.out.println(clonedInstance);

        System.out.println(instance.getToday() + "*****" +clonedInstance.getToday());

        Date tommorow = new Date(); tommorow.setYear(1999);
        instance.setToday(tommorow);
        System.out.println(instance.getToday() + "*****" +clonedInstance.getToday());

        System.out.println(instance==clonedInstance);
        System.out.println(instance.equals(clonedInstance));
        System.out.println(instance.getClass() == clonedInstance.getClass());
    }

}
