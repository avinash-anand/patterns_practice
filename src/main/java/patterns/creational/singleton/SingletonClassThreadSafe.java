package patterns.creational.singleton;

/**
 * This is thread safe, but very slow as unnecessary synchronisation is there
 */
public class SingletonClassThreadSafe {

    private static SingletonClassThreadSafe instance;
    private SingletonClassThreadSafe() {}

    public static synchronized SingletonClassThreadSafe getInstance() {
        if(instance == null) instance = new SingletonClassThreadSafe();
        return instance;
    }
}
