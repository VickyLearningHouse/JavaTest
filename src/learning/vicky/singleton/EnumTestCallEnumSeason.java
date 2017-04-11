package learning.vicky.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EnumTestCallEnumSeason {

    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        /**
         * Protected Object clone() throws exception, never return
         */
//        EnumSeason cloneSeason = (EnumSeason) EnumSeason.Autumn.clone();

        /**
         * Methods
         */
        System.out.println("the ordinal of the Spring: " + EnumSeason.Spring.ordinal());
        System.out.println("the ordinal of the Autumn: " + EnumSeason.Autumn.ordinal());
        System.out.println("Spring comapre to Autumn: " + EnumSeason.Spring.compareTo(EnumSeason.Autumn));

        System.out.println("Autumn.toString(): " + EnumSeason.Autumn.toString());
        System.out.println("Autumn.name(): " + EnumSeason.Autumn.name());
        System.out.println("Spring.hashCode(): " + EnumSeason.Spring.hashCode()) ;
        System.out.println("EnumSeason.Spring eaquls Spring? " + EnumSeason.Spring.equals("Spring"));
        System.out.println("Spring get Enum class: " + EnumSeason.Spring.getDeclaringClass());
        System.out.println(EnumSeason.Spring.valueOf(EnumSeason.class,"Spring"));

        System.out.println(EnumSeason.Autumn.getClass().getDeclaredConstructors());
        Constructor constructor = EnumSeason.Autumn.getDeclaringClass().getDeclaredConstructor(new Class[0]);
    }

}
