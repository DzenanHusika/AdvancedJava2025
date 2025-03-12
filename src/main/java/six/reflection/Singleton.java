package six.reflection;

import java.io.Closeable;
import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
    private Singleton(){
        System.out.println("Singleton Constructor se poziva samo jednom...");
    }

    private static Singleton INSTANCE = null;

    public static Singleton getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
