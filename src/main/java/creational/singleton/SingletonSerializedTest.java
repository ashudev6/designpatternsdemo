package creational.singleton;

import java.io.*;

public class SingletonSerializedTest {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializedSingleton obj = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("abc.ser"));
        out.writeObject(obj);
        out.close();
        ObjectInput in = new ObjectInputStream(new FileInputStream("abc.ser"));
        SerializedSingleton obj1 = (SerializedSingleton) in.readObject();
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());

    }
}
