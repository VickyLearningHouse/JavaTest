package learning.vicky.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

public class ClassToCallSingleton {

    private static final String  FILEPATH = "learning.vicky.singleton.Singleton";
    private static final String classPath = "C:\\software\\eclipse-jee-luna-SR2-win32-x86_64\\eclipse\\workspace\\JavaTest\\target\\classes";

    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
        /*File singleTonFile = new File("C:\\software\\eclipse-jee-luna-SR2-win32-x86_64\\eclipse\\workspace\\JavaTest\\target\\classes\\learning\\vicky\\singleton");
        URL url = singleTonFile.toURL();
        URLClassLoader classLoader = new URLClassLoader(new URL[]{url});
        Class<Singleton> instanceClass = (Class<Singleton>) classLoader.loadClass("learning.vicky.singleton.Singleton");*/
//        ClassLoader.getSystemClassLoader().loadClass(FILEPATH);
//        Class.forName(FILEPATH,true,ClassToCallSingleton.class.getClassLoader());
//        System.out.println(Singleton.instance);
        /*try {
            Singleton instance = Singleton.getInstance();
            Field object = Singleton.class.getDeclaredField("instance");
            object.setAccessible(true);
            Singleton instanceField = (Singleton) object.get(instance);
            System.out.println(instance);
            System.out.println(instanceField);

        } catch (NoSuchFieldException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/

//        Object instanceFromUrlLoader = classLoader.loadClass(FILEPATH);

//        ClassLoader classLoaderStart = Singleton.class.getClassLoader();


        /*System.out.println("###using getInstance() method start...###");
        Singleton instanceA = Singleton.getInstance();
        Singleton instanceB = Singleton.getInstance();
        System.out.println(instanceA==(instanceB));
        System.out.println("###using getInstance() method end...###");*/

        /*Singleton instance = instanceClass.newInstance();
        System.out.println("Is instance loaded by URLClassLoader(actually AppClassLoader) type of Singleton?");
        System.out.println(instance instanceof Singleton);
        System.out.println("###-------------------###'");*/

//        Class instanceE = Class.forName(FILEPATH, true, classLoader);
        //Object instanceFromUrlLoader = Class.forName("learning.vicky.singleton.Singleton", true, classLoader);
//        Constructor<Singleton> constructor = instanceE.getDeclaredConstructor(new Class[0]);
        /**
         *I don't have source code for package sun.*, can't see the source code
         *IllegalAccessException thrown, says can not access a member of class Singleton with modifiers "private"
         *
         *Q:where indeed is reflection?(when newInstance will check the constructor's access
         *then will use the method in sun.reflect.Reflection to implement reflec.)
         *
         */
        /*constructor.setAccessible(true);
        Singleton instanceF = constructor.newInstance();
        System.out.println("new instance created by constructor.newInstance()");
        System.out.println(instanceF==instanceA);

        System.out.println("### instance loaded by AppClassloader(Singleton's loader) type of Singleton?");
        System.out.println(instanceF instanceof Singleton);*/

        /**
         * change constructon of Singleton to public
         */
        /*Singleton singleFromURLLoader_01 = (Singleton) instanceE.newInstance();
        Singleton singleFromURLLoader_02 = (Singleton) instanceE.newInstance();
        System.out.println(singleFromURLLoader_01==(instanceB));
        System.out.println(singleFromURLLoader_01==(singleFromURLLoader_02));*/


        /*ClassLoader customLoader = new ClassLoader(){
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                return super.loadClass(name);
            }

        };*/

        MyFileClassLoader loader = new MyFileClassLoader();
        loader.setClassPath(classPath);
        Class singletonClassLoadedByMe = loader.findClass(FILEPATH);
        System.out.println(singletonClassLoadedByMe + "loader: " + singletonClassLoadedByMe.getClassLoader());

        Constructor constructor = singletonClassLoadedByMe.getDeclaredConstructor(int.class);
        constructor.setAccessible(true);

        // cast exception
        /*System.out.println(Singleton.class.getClassLoader());
        Singleton sigletonLodedMyself = (Singleton)constructor.newInstance(3);
        System.out.println(sigletonLodedMyself);*/


        //method getInstance() for loaded class
        Method getInstanceInLoadedClass = singletonClassLoadedByMe.getDeclaredMethod("getInstance", null);
        Object instanceByMethod = getInstanceInLoadedClass.invoke(getInstanceInLoadedClass, null);
        System.out.println(instanceByMethod);

        //compare instance between mine and app loaded
        //Singleton class is in class-path will hand over to appClassLoader
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
        System.out.println(instance.getClass().getClassLoader());


//        instance.count=100;

        //can not modify the fied in defferent loaded class
//        Field field_i = instance.getClass().getDeclaredField("i");
        /*Field field_i = instanceByMethod.getClass().getDeclaredField("i");
        field_i.setAccessible(true);
        field_i.set(Singleton.i, 66);
        System.out.println(Singleton.i);*/

        /*Field field_i = instanceByMethod.getClass().getDeclaredField("count");
        field_i.set(instanceByMethod, 90);
        System.out.println(instance.count);*/
    }


}
