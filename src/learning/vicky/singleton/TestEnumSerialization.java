package learning.vicky.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEnumSerialization {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        System.out.println("serilization starts");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Users/i332445/Documents/Enum.txt"));
        oos.writeObject(SingletonEnum.INSTANCE);
        oos.close();

        System.out.println("deserilization starts");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Users/i332445/Documents/Enum.txt"));
        Object obj = ois.readObject();
        ois.close();

        System.out.println(obj == SingletonEnum.INSTANCE);
        System.out.println(obj instanceof SingletonEnum);
    }

}
