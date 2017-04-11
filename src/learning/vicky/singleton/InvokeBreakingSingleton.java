package learning.vicky.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class InvokeBreakingSingleton {

    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
            IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Singleton instance = Singleton.getInstance();
        Constructor<Singleton> constructor = (Constructor<Singleton>) instance.getClass().getDeclaredConstructor(
                int.class);
        constructor.setAccessible(true);
        Singleton newInstance = constructor.newInstance(4);
        System.out.println(instance == newInstance);

    }

}
