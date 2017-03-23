package learning.vicky.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestClassSingletonSerilization {
    private static final String  FILEPATH = "learning.vicky.singleton.Singleton";
    private static final String STEAMPATH = "C:/Users/i332445/Documents/Enum.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException{

        Singleton instanceRet = Singleton.getInstance();

        FileOutputStream fos = new FileOutputStream(STEAMPATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(instanceRet);
        fos.close();
        oos.close();

        FileInputStream fis = new FileInputStream(STEAMPATH);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Singleton instance = (Singleton) ois.readObject();
        System.out.println(instance == Singleton.getInstance());
        fis.close();
        ois.close();
    }

}
