package generalTest;

import java.lang.reflect.Field;
import java.lang.invoke.MethodHandle;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
	Class integer = Integer.class.getDeclaredClasses()[0];
	Field c = integer.getDeclaredField("cache");
	c.setAccessible(true);
	Integer[] array = (Integer[]) c.get(integer);
	array[132] = array[133];
//	System.out.printf("%d",4);
	System.out.println(new Integer(4));
    }

}
