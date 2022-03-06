package creational.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SerializedSingleton implements Serializable  {
    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}

    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }

    protected Object readResolve() {
        System.out.println("read reslove called");
        return getInstance();
    }

//    private static final long serialVersionUID = 1L;
//
//    private static SerializedSingleton obj = null;
//
//    private SerializedSingleton() {
//
//    }
//

//
//    // if making synchronized then one thread will execute it at one time…//if
//// performance of get instance
//    public static SerializedSingleton getInstance() {
//        if (obj == null) {
//            System.out.println("obj null");
//            return obj=new SerializedSingleton();
//        } else
//            return obj;
//    }
}
