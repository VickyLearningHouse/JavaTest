package learning.vicky.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ClassToCallSingletonSerilization {
    private static final String  FILEPATH = "learning.vicky.singleton.Singleton";

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        
        SingleImpSerilizaiton instanceRet = SingleImpSerilizaiton.getInstance();
        
        FileOutputStream fos = new FileOutputStream("C:\\software\\eclipse-jee-luna-SR2-win32-x86_64\\eclipse\\workspace\\JavaTest\\src\\learning\\vicky\\singleton\\SingleImpSerilizaiton.java");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(instanceRet);
        fos.close();
        oos.close();

        FileInputStream fis = new FileInputStream("C:\\software\\eclipse-jee-luna-SR2-win32-x86_64\\eclipse\\workspace\\JavaTest\\src\\learning\\vicky\\singleton\\SingleImpSerilizaiton.java");
        ObjectInputStream ois = new ObjectInputStream(fis);

        SingleImpSerilizaiton instance = (SingleImpSerilizaiton) ois.readObject();
        System.out.println(instance == SingleImpSerilizaiton.getInstance());
        fis.close();
        ois.close();
    }

}
