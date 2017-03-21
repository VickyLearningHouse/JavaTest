package learning.vicky.singleton;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class ClassToCallSingleton {

    private static final String  FILEPATH = "learning.vicky.singleton.Singleton";

    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        File singleTonFile = new File("C:\\software\\eclipse-jee-luna-SR2-win32-x86_64\\eclipse\\workspace\\JavaTest\\target\\classes\\learning\\vicky\\singleton");
        URL url = singleTonFile.toURL();
        URLClassLoader classLoader = new URLClassLoader(new URL[]{url});
        Class<Singleton> instanceClass = (Class<Singleton>) classLoader.loadClass("learning.vicky.singleton.Singleton");
        Object instanceFromUrlLoader = classLoader.loadClass(FILEPATH);

//        ClassLoader classLoaderStart = Singleton.class.getClassLoader();


        System.out.println("###using getInstance() method start...###");
        Singleton instanceA = Singleton.getInstance();
        Singleton instanceB = Singleton.getInstance();
        System.out.println(instanceA==(instanceB));
        System.out.println("###using getInstance() method end...###");

        /*Singleton instance = instanceClass.newInstance();
        System.out.println("Is instance loaded by URLClassLoader(actually AppClassLoader) type of Singleton?");
        System.out.println(instance instanceof Singleton);
        System.out.println("###-------------------###'");*/

        Class instanceE = Class.forName(FILEPATH, true, classLoader);
        //Object instanceFromUrlLoader = Class.forName("learning.vicky.singleton.Singleton", true, classLoader);
        Constructor<Singleton> constructor = instanceE.getDeclaredConstructor(new Class[0]);
        /**
         *I don't have source code for package sun.*, can't see the source code
         *IllegalAccessException thrown, says can not access a member of class Singleton with modifiers "private"
         *
         *Q:where indeed is reflection?(when newInstance will check the constructor's access
         *then will use the method in sun.reflect.Reflection to implement reflec.)
         *
         */
        constructor.setAccessible(true);
        Singleton instanceF = constructor.newInstance();
        System.out.println("new instance created by constructor.newInstance()");
        System.out.println(instanceF==instanceA);

        System.out.println("### instance loaded by AppClassloader(Singleton's loader) type of Singleton?");
        System.out.println(instanceF instanceof Singleton);

        /**
         * change constructon of Singleton to public
         */
        /*Singleton singleFromURLLoader_01 = (Singleton) instanceE.newInstance();
        Singleton singleFromURLLoader_02 = (Singleton) instanceE.newInstance();
        System.out.println(singleFromURLLoader_01==(instanceB));
        System.out.println(singleFromURLLoader_01==(singleFromURLLoader_02));*/


        ClassLoader customLoader = new ClassLoader(){
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                return super.loadClass(name);
            }
        };

        Object customObj = customLoader.loadClass(FILEPATH);
        System.out.println("### instance loaded by customer classloader type of Singleton?");
        System.out.println(customObj instanceof Singleton);

    }


}
